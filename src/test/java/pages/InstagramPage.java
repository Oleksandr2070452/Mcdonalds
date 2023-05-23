package pages;

import elements.InstagramElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InstagramPage extends InstagramElements {
    public InstagramPage(WebDriver driver) {
        super(driver);
    }

    public String getLinkFromInstagramBtn() {
        return getVisibilityElementByXpath(INSTAGRAM_HEADER_TITTLE).getAttribute("aria-label");
    }
}
