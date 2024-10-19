package pom_tests;

import driver.DriverFactory;
import models.pages.LoginPageMod01;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class LoginTestMod01 {
    public static void main(String[] args) {

        //Launch browser
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate
        try {
            driver.get(Urls.urlBase.concat(Urls.loginSlug));

            LoginPageMod01 loginPage = new LoginPageMod01(driver);
            loginPage.username().sendKeys("Teo");
            loginPage.password().sendKeys("12345");
            loginPage.loginBtn().click();

        }catch (Exception e){
            e.printStackTrace();
        }

        //Quit browser
        driver.quit();
    }
}
