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
}
