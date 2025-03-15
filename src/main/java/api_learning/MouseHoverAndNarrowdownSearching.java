package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import url.Urls;

import java.util.List;

public class MouseHoverAndNarrowdownSearching {
    private static final By figureSel = By.cssSelector(".figure");
    private static final By profileNameSel = By.cssSelector(".figcaption h5");
    private static final By profileLinkSel = By.cssSelector(".figcaption a");

    public static void main(String[] args) {

        //Launch a browser session
        WebDriver driver = DriverFactory.getChromeDriver();

        try {
            //Navigate to target page
            driver.get(Urls.urlBase.concat(Urls.hoverSlug));

            //Target parent element
            List<WebElement> figures = driver.findElements(figureSel);
            if (figures.isEmpty())
                throw new RuntimeException("No figures found");

            //Define Action object
            Actions actions = new Actions(driver);

            for (WebElement figure : figures) {
                //Before hover
                WebElement profileNameElem = figure.findElement(profileNameSel);
                WebElement profileLinkElem = figure.findElement(profileLinkSel);

                System.out.println(profileNameElem.getText() + ": " + profileNameElem.isDisplayed());
                System.out.println(profileLinkElem.getText() + ": " + profileLinkElem.isDisplayed());

                Thread.sleep(1000);

                //Mouse hover
                actions.moveToElement(figure).perform();

                //After hover
                System.out.println(profileNameElem.getText() + ": " + profileNameElem.isDisplayed());
                System.out.println(profileLinkElem.getText() + ": " + profileLinkElem.isDisplayed());
                Thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Quit session
        driver.quit();

    }

}
