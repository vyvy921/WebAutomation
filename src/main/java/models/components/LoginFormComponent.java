package models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginFormComponent {

    private final WebDriver driver;
    private static final By username = By.id("username");
    private static final By password = By.cssSelector("#password");
    private static final By loginBtn = By.cssSelector("[type='submit']");

    public LoginFormComponent(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUsername(String usernameTxt) {
        driver.findElement(username).sendKeys(usernameTxt);
    }

    public void inputPassword(String passwordTxt) {
        driver.findElement(password).sendKeys(passwordTxt);
    }

    public void clickLoginBtn() {
        driver.findElement(loginBtn).click();
    }
}
