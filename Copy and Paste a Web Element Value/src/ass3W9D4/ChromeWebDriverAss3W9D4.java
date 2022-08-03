package ass3W9D4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeWebDriverAss3W9D4 {
	public WebDriver driver;

	/**
	 * Set up browser settings and open the application
	 * 
	 * @throws InterruptedException
	 */

	@BeforeTest
	public void setUp() throws InterruptedException {
		// the path for open WebSite
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\lo0ol\\" + "Downloads\\Compressed\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php?locale=en_US");
		System.out.println(driver.getTitle());
	}

	/**
	 * Test using Copy and Paste
	 * 
	 * @throws InterruptedException
	 */
	@Test
	public void LearnEnglishWebSite() throws InterruptedException {

		// firstName
		WebElement firstName = driver.findElement(By.cssSelector("input[aria-label='First name']"));
		firstName.sendKeys("Mawaddah");
//		Thread.sleep(2000);

		// lastName
		WebElement lastName = driver.findElement(By.cssSelector("input[aria-label='Last name']"));
		lastName.sendKeys("Hanbali");
//		Thread.sleep(2000);

		// email
		WebElement email = driver.findElement(By.cssSelector("input[name='reg_email__']"));
		email.sendKeys("Mawadah@text.com");
//		Thread.sleep(2000);

		// password
		WebElement password = driver.findElement(By.cssSelector("input#password_step_input"));
		password.sendKeys("Mawadah@text.com");
//		Thread.sleep(2000);

		// go to the email text field
		Actions action = new Actions(driver);
		action.moveToElement(email).click().build().perform();
//		Thread.sleep(2000);

		// select email
		action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(2000);

		// copy email
		action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(2000);

		// re-enter email
		WebElement reEnterEmail = driver.findElement(By.cssSelector("input[name='reg_email_confirmation__']"));
		
		// go to re-enter email
		action.moveToElement(reEnterEmail).click().build().perform();
//		Thread.sleep(2000);

		// paste email
		action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//		Thread.sleep(2000);

		// monthBirthday
		WebElement monthBirthday = driver.findElement(By.cssSelector("select#month"));
		monthBirthday.sendKeys("Apr");
//		Thread.sleep(2000);

		// dayBirthday
		WebElement dayBirthday = driver.findElement(By.cssSelector("#day"));
		dayBirthday.sendKeys("1");
//		Thread.sleep(2000);

		// yearBirthday
		WebElement yearBirthday = driver.findElement(By.cssSelector("#year"));
		yearBirthday.sendKeys("2022");
//		Thread.sleep(2000);

		// password
		WebElement gender = driver.findElement(By.cssSelector("input[class='_8esa']"));
		gender.click();
//		Thread.sleep(2000);

		// signUp
		WebElement signUp = driver.findElement(By.cssSelector("button[name='websubmit']"));
		signUp.click();
//		Thread.sleep(2000);

	}

	/**
	 * Tear down the setup after test completes
	 */
	@AfterTest
	public void terminateBrowser() {
		// Close the browser
		driver.close();

		// Quite the selenium
		driver.quit();
	}
}
