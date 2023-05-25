package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class TwitterElements extends BasePage {
    public TwitterElements(WebDriver driver) {
        super(driver);
    }

    public static final String TWITTER_HEADER_TITTLE = "//h2[@dir='ltr']";
}