package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomeElements extends BasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public static final String SEARCH_BTN = "//a[@class='cmp-list__item-link']/span[@class='item-text']";
    public static final String SALARY_CALCULATOR_BTN = "//span[contains(text(),'Зарплатний калькулятор')]";

}
