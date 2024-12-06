package models.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Component {
    protected WebDriver driver;
    protected WebElement component;
    protected WebDriverWait wait;

    public Component(WebDriver driver, WebElement component){
        this.driver = driver;
        this.component = component;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //narrow down searching
    public WebElement findElement(By by) {
        return component.findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return component.findElements(by);
    }

    public <T extends Component> T findComponent(Class<T> classComponent, WebDriver driver) {
        return findComponents(classComponent, driver).get(0);
    }

    public <T extends Component> List<T> findComponents(Class<T> classComponent, WebDriver driver) {
        String cssSelector;
        try {
            classComponent.getAnnotation(ComponentCssSelector.class).value();
        }catch (Exception e){
            throw new IllegalArgumentException("[Err] Component must have Annotation");
        } //component quen de Annotation

        return null;
    }

}
