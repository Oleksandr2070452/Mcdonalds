package pages;

import elements.MenuElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage extends MenuElements {
    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getNumberOfMenuItems() {
        return getVisibilityOfElementsByXpath(PRODUCT_BTN);
    }
}

