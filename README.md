# Copy-and-Paste-a-Web-Element-Value
Assignment 3 W9D4 - SDA - Software QA Bootcamp

## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)

---
## Question
- STEP 1: Pick you favorite website that contains two text fields in order
- STEP 2: Perform copy/paste from one element to another

## Answer
I used a ["Facebook"](https://www.facebook.com/r.php?locale=en_US)

### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I opened the website, then I used the "email" text field to copy the text from it, then paste it into the "re-enter email" text field.

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182699353-236ae658-78ec-48a7-9467-cd5fc6b468cf.png" width=80% height=80%>
</p>

- Select email

```md
action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
```

- Copy email

```md
action.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
```

- Go to re-enter email tesxtField

```md
action.moveToElement(reEnterEmail).click().build().perform();
```

- Paste email

```md
action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
```


---
## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/182699843-1664c928-ed98-4e82-a6bc-61a524747cba.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/182700148-cc7a40b2-878e-48d9-b1fa-182f3ef28738.mp4
</p>
