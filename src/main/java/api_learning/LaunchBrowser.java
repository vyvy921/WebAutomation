package api_learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        openChrome();
    }

    public static void openChrome(){
       WebDriver chrome = new ChromeDriver();
       chrome.get("http://www.google.com");
//       chrome.quit();
    }
}
