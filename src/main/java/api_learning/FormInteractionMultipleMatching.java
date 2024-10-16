package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FormInteractionMultipleMatching {
    public static void main(String[] args) {
//        Get a chrome
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
//        Navigate to the target page
            driver.get("https://the-internet.herokuapp.com/login");

//        Define selector values
            By loginInputFieldsSel = By.tagName("input_");

//        Interaction
            List<WebElement> loginFormFieldsElem = driver.findElements(loginInputFieldsSel);
            final int USERNAME_INDEX = 0;
            final int PASSWORD_INDEX = 1;
            if (!loginFormFieldsElem.isEmpty()) {
                loginFormFieldsElem.get(USERNAME_INDEX).sendKeys("teo@sth");
                loginFormFieldsElem.get(PASSWORD_INDEX).sendKeys("123");
            } else {
                //Assert.fail("...")
                System.out.println("No login form found");
            }

//        debug only
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Quit the session
        driver.quit();
    }
}
