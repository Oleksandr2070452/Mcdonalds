package pages;

import elements.TwitterElements;
import org.openqa.selenium.WebDriver;

public class TwitterPage extends TwitterElements {
    public TwitterPage(WebDriver driver) {
        super(driver);
    }

    public String getTwitterTitle() {
        return getVisibilityElementByXpath(TWITTER_HEADER_TITTLE).getText();
    }
}