package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ui.WaitMoreThanOneTab;
import support.ui.WaitSth;
import url.Urls;

import java.time.Duration;

public class ExplicitWait {
    public static void main(String[] args) {

        //Launch a driver session
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate to target page
        try {
            driver.get(Urls.urlBase.concat(Urls.loginSlug));

        //Locator & element
            By wrongSel = By.cssSelector("#css");
            By loginSel = By.cssSelector(".radius");

        //Explicit wait
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            //2 cach su dung
//            wait.until(ExpectedConditions.visibilityOfElementLocated(wrongSel));
//            wait.until(ExpectedConditions.visibilityOf(driver.findElement(wrongSel)); //parameter driver.findElement(wrongSel) chay truoc => apply implicit wait truoc

            //customize
            wait.until(new WaitSth(loginSel));
            wait.until(new WaitMoreThanOneTab());

        }catch (Exception e){
            e.printStackTrace();
        }

        //Quit session
        driver.quit();

    }
}
