package pom_tests;

import driver.DriverFactory;
import models.pages.LoginPageMod02;
import models.pages.LoginPageMod03;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTestMod03 {
    public static void main(String[] args) {

        //Launch browser
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate
        try {
            driver.get(Urls.urlBase.concat(Urls.loginSlug));

            LoginPageMod03 loginPage = new LoginPageMod03(driver);

            loginPage.loginFormComp().inputUsername("username3");
            loginPage.loginFormComp().inputPassword("12345");
            loginPage.loginFormComp().clickLoginBtn();

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Quit browser
        driver.quit();
    }
}
