package models.pages;

import models.components.LoginFormComponent;
import org.openqa.selenium.WebDriver;

public class LoginPageMod03 {

    private final WebDriver driver;

    public LoginPageMod03(WebDriver driver) {
        this.driver = driver;
    }

    // introduce cac component
    public LoginFormComponent loginFormComp(){
        return new LoginFormComponent(driver);
    }

    // introduce component 2,....


}
