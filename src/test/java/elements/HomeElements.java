package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomeElements extends BasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }
    public static final String SEARCH_BTN = "//a[@class='cmp-list__item-link']/span[@class='item-text']";
    public static final String SALARY_CALCULATOR_BTN = "//span[contains(text(),'Зарплатний калькулятор')]";
    public static final String MENU_BTN = "//button[@aria-controls='ourMenuSubItemsList_desktop']";
    public static final String FULL_MENU_BTN = "//div[@id='ourMenuSubItemsList_desktop']" +
            "//div[@class='view-full-menu d-none d-lg-block']/a";
    public static final String FOUNDATION_RONALDA_BTN =
            "//div[@class='cmp-footer__nav-links']//a[contains(@data-cmp-data-layer,'Фундація')]";
    public static final String FOUNDATION_RONALDA_TITTLE =
            "//div[@id='title-5715acaaad']/h1";
    public static final String VISIT_SITE_BTN = "//a[@class='cmp-teaser__action-link ']";
    public static final String OPEN_RESTAURANT = "(//ul[@id='list-750fab3099']/li/a/span)[2]";
}
