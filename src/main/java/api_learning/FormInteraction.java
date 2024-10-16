package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class FormInteraction {
    public static void main(String[] args) {
//        Get a chrome
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
//        Navigate to the target page
            driver.get("https://the-internet.herokuapp.com/login");

//        Define selector values
            By usernameSel = By.id("username");
            By passwordSel = By.cssSelector("#password");
            By loginBtnSel = By.cssSelector("[type=\"submit\"]");
            By linkTextSel = By.linkText("Elemental Selenium");
            By partialLinkTextSel = By.partialLinkText("Selenium");

//        Find Elements
            WebElement usernameElem = driver.findElement(usernameSel);
            WebElement passwordElem = driver.findElement(passwordSel);
            WebElement loginBtnElem = driver.findElement(loginBtnSel);
            WebElement linkTextElem = driver.findElement(linkTextSel);
            WebElement partialLinkTextElem = driver.findElement(partialLinkTextSel);

//        Interaction
            usernameElem.sendKeys("tomsmith");
            passwordElem.sendKeys("SuperSecretPassword!");

            //Interact with Attribute, CSS
            System.out.println("Attribute class: " + loginBtnElem.getAttribute("class"));
            System.out.println("Attribute type: " + loginBtnElem.getAttribute("type"));
            System.out.println("Background Value: " + loginBtnElem.getCssValue("background-color"));
            loginBtnElem.click();

            //refresh page, go to previous
            driver.navigate().back();
            driver.navigate().refresh();
            //re-interact
            usernameElem = driver.findElement(usernameSel);
            passwordElem = driver.findElement(passwordSel);
            loginBtnElem = driver.findElement(loginBtnSel);
            linkTextElem = driver.findElement(linkTextSel);
            partialLinkTextElem = driver.findElement(partialLinkTextSel);

            usernameElem.sendKeys("email@gmail.com");
            passwordElem.sendKeys("1234");

            //Interact with Link

            linkTextElem.click();
            partialLinkTextElem.click();
            System.out.println("Page title: " + driver.getTitle());
            System.out.println("Current URL: " + driver.getCurrentUrl());

            loginBtnElem.click();
//
//        debug only
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Quit the session
        driver.quit();
    }
}
