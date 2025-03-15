package support.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitForElementEnable implements ExpectedCondition<Boolean> {

    private By selectorParent;
    private By selector;

    public WaitForElementEnable(By selectorParent, By selector) {
        this.selector = selector;
        this.selectorParent = selectorParent;
    }

    public WaitForElementEnable(By selector) {
        this.selector = selector;
    }

    @Override
    public Boolean apply(WebDriver input) {

        if (selectorParent == null)
            return input.findElement(selector).isEnabled();

        else return input.findElement(selectorParent).findElement(selector).isEnabled();
    }
}
