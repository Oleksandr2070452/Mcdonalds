package pages;

import elements.SearchElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchPage extends SearchElements {
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    public SearchPage setSearchData(String data) {
        getVisibilityElementByXpath(SEARCH_FIELD).sendKeys(data);
        return this;
    }

    public SearchPage clickSearchBtn() {
        getClickableElementByXpath(SEARCH_BTN).click();
        return this;
    }

    public List<WebElement> getListResult() {
        return getVisibilityOfElementsByXpath(LIST_RESULT);
    }
}
