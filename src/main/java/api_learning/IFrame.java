package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import url.Urls;

public class IFrame {
    public static void main(String[] args) {

        //Launch chrome session
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate to target page
        try {
            driver.get(Urls.urlBase.concat(Urls.iframeSlug));

            //locate the iframe
            By iFrameSel = By.cssSelector("[id$='ifr']");
            WebElement iFrameElem = driver.findElement(iFrameSel);

            //Switch to iframe
            driver.switchTo().frame(iFrameElem);

            //locate element inside iframe
            WebElement editorInputElem = driver.findElement(By.cssSelector("[id='tinymce']"));
            editorInputElem.click();
            editorInputElem.clear();
            editorInputElem.sendKeys("hello");
            Thread.sleep(1000);

            //Switch back parent frame
            driver.switchTo().defaultContent();
            driver.findElement(By.linkText("Elemental Selenium")).click();
            Thread.sleep(1000);


        }catch (Exception e){
            e.printStackTrace();
        }


        //Quit session
        driver.quit();
    }
}
