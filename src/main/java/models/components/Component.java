package models.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Component {
    protected WebDriver driver;
    protected WebElement element;
    protected WebDriverWait wait;

    public Component(WebDriver driver, WebElement element) {
        this.driver = driver;
        this.element = element;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }



}
