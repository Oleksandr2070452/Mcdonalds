package pages;

import elements.AppStoreElements;
import org.openqa.selenium.WebDriver;

public class AppStorePage extends AppStoreElements {
    public AppStorePage(WebDriver driver) {
        super(driver);
    }

    public String getAppHeaderTitle() {

        return getVisibilityElementByXpath(APP_HEADER_TITTLE).getText();
    }
}
