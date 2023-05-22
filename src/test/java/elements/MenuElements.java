package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class MenuElements extends BasePage {
    public MenuElements(WebDriver driver) {
        super(driver);
    }

    public static final String PRODUCT_BTN = "//li[@class='cmp-category__item']";
}
