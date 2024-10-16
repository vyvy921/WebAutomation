package support.ui;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class WaitMoreThanOneTab implements ExpectedCondition<Boolean> {
    @Override
    public Boolean apply(WebDriver input) {
        return input.getWindowHandles().size() > 1;
    }
}
