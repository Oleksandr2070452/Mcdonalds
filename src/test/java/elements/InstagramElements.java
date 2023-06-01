package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class InstagramElements extends BasePage {
    public InstagramElements(WebDriver driver) {
        super(driver);
    }

    public static final String INSTAGRAM_HEADER_TITTLE = "//div[@class='_aagx']/*[name()='svg']";
}
