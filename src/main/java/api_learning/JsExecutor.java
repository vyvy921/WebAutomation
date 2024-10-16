package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import url.Urls;

public class JsExecutor {
    public static void main(String[] args) {
        //Launch browser session
        WebDriver driver = DriverFactory.getChromeDriver();


        try {
            //Navigate to target page
            driver.get(Urls.urlBase.concat(Urls.floatingMenuSlug));

            //Scroll to bottom
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            Thread.sleep(1000);

            //Scroll to top
            javascriptExecutor.executeScript("window.scrollTo(document.body.scrollHeight, 0);");

            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Quit session
        driver.quit();


    }
}
