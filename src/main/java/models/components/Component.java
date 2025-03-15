package models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.Constructor;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Component {
    protected WebDriver driver;
    protected WebElement component;
    protected WebDriverWait wait;

    public Component(WebDriver driver, WebElement component) {
        this.driver = driver;
        this.component = component;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //narrow down searching
    //dua vao 1 cssSelector, find and return 1 element
    public WebElement findElement(By by) {
        return component.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return component.findElements(by);
    }

    //Param dau vao: template, driver
    public <T extends Component> T findComponent(Class<T> classComponent, WebDriver driver) {
        return findComponents(classComponent, driver).get(0);
    }

    public <T extends Component> List<T> findComponents(Class<T> classComponent, WebDriver driver) {
        //Get Component selector. Find all Elements
        String cssSelector;
        try {
            cssSelector = classComponent.getAnnotation(ComponentCssSelector.class).value();
        } catch (Exception e) {
            throw new IllegalArgumentException("[Err] Component must have Annotation");
        } //component quen de Annotation

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(cssSelector)));
        List<WebElement> results = findElements(By.cssSelector(cssSelector));
        //Dung ki thuat Java reflection. Tao ra constructor params
        Class<?>[] params = new Class[]{WebDriver.class, WebElement.class};
        Constructor<T> constructor;
        try {
            constructor = classComponent.getConstructor(params);
        } catch (Exception e) {
            throw new IllegalArgumentException("[Err] Component must have Constructor with param" + Arrays.toString(params));
        }

        //Convert cac elements dang co thanh Component
        List<T> components = results.stream().map(webElement -> {
            try {
                return constructor.newInstance(driver, webElement);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }).collect(Collectors.toList());

        return components;
    }

}
