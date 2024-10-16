package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.ui.SelectEx;
import url.Urls;

public class Dropdown {
    public static void main(String[] args) {
        // Get chrome version
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            //Navigation to target page
            driver.get(Urls.urlBase.concat(Urls.dropdownSlug));

            //Select locator & Element
            By dropdownSle = By.id("dropdown");
            WebElement dropdownElem = driver.findElement(dropdownSle);

            //Select dropdown
            Select select = new Select(dropdownElem);

            //Select by visible text | option 2
            select.selectByVisibleText("Option 2");
            Thread.sleep(1000);

            //Select by index | option 1
            select.selectByIndex(1);
            Thread.sleep(1000);

            //Select by value | option 2
            select.selectByValue("2");
            Thread.sleep(1000);

            //Customize
            SelectEx selectEx = new SelectEx(dropdownElem);
            selectEx.selectOption1();
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Close session
        driver.quit();
    }

}
