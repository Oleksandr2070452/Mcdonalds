package pages;

import elements.GooglePlayElements;
import org.openqa.selenium.WebDriver;

public class GooglePlayPage extends GooglePlayElements {
    public GooglePlayPage(WebDriver driver) {
        super(driver);
    }

    public String getGooglePlayTitle() {

        return getVisibilityElementByXpath(GOOGLE_PLAY_TITTLE).getText();
    }
}