package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class SearchElements extends BasePage {
    public SearchElements(WebDriver driver) {
        super(driver);
    }

    public static final String SEARCH_FIELD = "//input[@id='form-text-1673594539']";
    public static final String SEARCH_BTN = "//button[@id='button-93a5672f17']";
    public static final String LIST_RESULT ="//h3[@class='cmp-site-search__result-container--heading']/a";
}
