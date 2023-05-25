package pages;

import elements.InstagramElements;
import org.openqa.selenium.WebDriver;

public class InstagramPage extends InstagramElements {
    public InstagramPage(WebDriver driver) {
        super(driver);
    }

    public String getLinkFromInstagramBtn() {
        return getVisibilityElementByXpath(INSTAGRAM_HEADER_TITTLE).getAttribute("aria-label");
    }
}
