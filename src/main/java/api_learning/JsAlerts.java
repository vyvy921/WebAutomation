package api_learning;

import driver.DriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import url.Urls;

import java.time.Duration;

public class JsAlerts {

    private final static By jsAlertSel = By.cssSelector("[onclick='jsAlert()']");
    private final static By jsConfirmSel = By.cssSelector("[onclick='jsConfirm()']");
    private final static By jsPromptSel = By.cssSelector("[onclick='jsPrompt()']");
    private final static By resultSel = By.cssSelector("#result");

    public static void main(String[] args) {
        //Launch a browser
        WebDriver driver = DriverFactory.getChromeDriver();

        //Navigate to target page
        try {
            driver.get(Urls.urlBase.concat(Urls.jsAlertSlug));

            //Tao Alert object
            WebElement triggerAlertBtn;
            Alert alert;
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));

            //JS_ALERT | Accept
            triggerAlertBtn = driver.findElement(jsAlertSel);
            triggerAlertBtn.click();
            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(alert.getText());
            alert.accept();
            System.out.println("Result" + driver.findElement(resultSel).getText());

            //JS_CONFIRM | Deny
            triggerAlertBtn = driver.findElement(jsConfirmSel);
            triggerAlertBtn.click();
            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(alert.getText());
            alert.dismiss();
            System.out.println("Result" + driver.findElement(resultSel).getText());

            //JS_PROMPT | send text
            triggerAlertBtn = driver.findElement(jsPromptSel);
            triggerAlertBtn.click();
            alert = wait.until(ExpectedConditions.alertIsPresent());
            System.out.println(alert.getText());
            alert.sendKeys("Hello my friends");
            alert.accept();
            System.out.println("Result" + driver.findElement(resultSel).getText());


        }catch (Exception e){
            e.printStackTrace();
        }
        //Quit session
        driver.quit();
    }
}
