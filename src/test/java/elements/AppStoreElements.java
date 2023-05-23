package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class AppStoreElements extends BasePage {
    public AppStoreElements(WebDriver driver) {
        super(driver);
    }

    public static final String APP_HEADER_TITTLE = "//h1";
}
