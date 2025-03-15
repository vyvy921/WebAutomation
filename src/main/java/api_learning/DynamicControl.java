package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.ui.WaitForElementEnable;
import url.Urls;

import java.time.Duration;

public class DynamicControl {
    public static void main(String[] args) {

        //Launch browser session
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            //Navigate to target page
            driver.get(Urls.urlBase.concat(Urls.dynamicControlSlug));

            //Parents locator : id="checkbox-example" + id="input-example"
            By checkboxSel = By.id("checkbox-example");
            By inputSel = By.id("input-example");

            //narrow down from checkbox-example
            WebElement checkboxFormElem = driver.findElement(checkboxSel);
            WebElement checkboxElem = checkboxFormElem.findElement(By.tagName("input"));
            if (!checkboxElem.isSelected()) checkboxElem.click();

            Thread.sleep(1000);

            //narrow down from input-example
            WebElement inputFormElem = driver.findElement(inputSel);
            WebElement inputFieldElem = inputFormElem.findElement(By.tagName("input"));
            WebElement inputBtnElem = inputFormElem.findElement(By.tagName("button"));

            if (!inputFieldElem.isEnabled()) inputBtnElem.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            //Option 1
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading")));
            //Option 2
//            wait.until(new WaitForElementEnable(inputSel, By.tagName("button")));
            //Option 3
            wait.until(new WaitForElementEnable(By.cssSelector("#input-example input")));

            inputFieldElem.sendKeys("test sendkey ne");

            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }


        //Quit session
        driver.quit();


    }
}
