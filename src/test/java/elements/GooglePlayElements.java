package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class GooglePlayElements extends BasePage {
    public GooglePlayElements(WebDriver driver) {
        super(driver);
    }

    public static final String GOOGLE_PLAY_TITTLE = "//h1";
}