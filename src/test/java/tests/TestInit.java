package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.ArrayList;

public class TestInit extends Assert {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(option);
        driver.get("https://www.mcdonalds.com/ua/uk-ua.html");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void closeTest() {
        driver.quit();
    }

    public void switchToTab(WebDriver drv, Integer num) {
        ArrayList<String> tab = new ArrayList<>
                (drv.getWindowHandles());
        drv.switchTo().window(tab.get(num));
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }
}
