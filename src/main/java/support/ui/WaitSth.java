package support.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitSth implements ExpectedCondition<Boolean>
{
    By cssSelector;

    public WaitSth(By cssSelector) {
        this.cssSelector = cssSelector;
    }

    @Override
    public Boolean apply(WebDriver input) {
        return input.findElement(cssSelector).getText().equals("Login");
    }
}
