package models.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageMod01 {

    private final WebDriver driver;
    private static final By username = By.id("username");
    private static final By password = By.cssSelector("#password");
    private static final By loginBtn = By.cssSelector("[type='submit']");;

    public LoginPageMod01(WebDriver driver) {
        this.driver = driver;
    }

    //service methods
    public WebElement username() {
        return driver.findElement(username);
    }

    public WebElement password() {
        return driver.findElement(password);
    }

    public WebElement loginBtn() {
        return driver.findElement(loginBtn);
    }

}
