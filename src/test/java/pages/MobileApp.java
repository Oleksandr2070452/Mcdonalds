package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class MobileApp extends BasePage {

    public MobileApp(WebDriver driver) {
        super(driver);
    }

    public void getUrlMobileApp() {
        driver.get("https://www.mcdonalds.com/ua/uk-ua/eat/gmal.html");
    }

    public WebElement getLogoButton() {
        return driver.findElement(By.xpath("(//img[@src='/content/dam/sites/ua/nfl/icons/Logo_on_white_desktop_Small.jpg'])[2]"));
    }

    public void clickLogoButton() {
        getLogoButton().click();
    }
}