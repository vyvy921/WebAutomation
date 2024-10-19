package pom_tests;

import driver.DriverFactory;
import models.pages.LoginPageMod01;
import models.pages.LoginPageMod02;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTestMod02 {
    public static void main(String[] args) {

        //Launch browser
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate
        try {
            driver.get(Urls.urlBase.concat(Urls.loginSlug));

            LoginPageMod02 loginPage = new LoginPageMod02(driver);
            loginPage.inputUsername("ustest");
            loginPage.inputPassword("password123");
            loginPage.clickLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Quit browser
        driver.quit();
    }
}
