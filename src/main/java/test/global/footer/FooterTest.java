package test.global.footer;

import driver.DriverFactory;
import models.components.global.footer.InformationColumnComponent;
import models.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import url.Urls;

public class FooterTest {
    public static void main(String[] args) {
        WebDriver driver = DriverFactory.getChromeDriver();

        testFooterHomePage(driver);
        testFooterCategoryPage(driver);
        testFooterRegisterPage(driver);
        testFooterLoginPage(driver);
    }

    private static void testFooterHomePage(WebDriver driver) {
        driver.get(Urls.demoBaseUrl);

        HomePage homePage = new HomePage(driver);
        InformationColumnComponent informationColumnComp = homePage.footerComp().informationColumnComp();
        System.out.println(informationColumnComp.headerElem().getText());
        informationColumnComp.linksElem().forEach(link -> {
            System.out.println(link.getText());
            System.out.println(link.getAttribute("href"));
        });

        driver.quit();
    }

    private static void testFooterCategoryPage(WebDriver driver) {
    }

    private static void testFooterRegisterPage(WebDriver driver) {
    }

    private static void testFooterLoginPage(WebDriver driver) {
    }

}
