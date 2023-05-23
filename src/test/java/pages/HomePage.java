package pages;

import elements.HomeElements;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickSearchBtn() {
        getClickableElementByXpath(SEARCH_BTN).click();
        return this;
    }

    public HomePage clickSalaryCalculatorBtn() {
        getClickableElementByXpath(SALARY_CALCULATOR_BTN).click();
        return this;
    }

    public HomePage clickMenuBtn() {
        getClickableElementByXpath(MENU_BTN).click();
        return this;
    }

    public HomePage clickFullMenuBtn() {
        getClickableElementByXpath(FULL_MENU_BTN).click();
        return this;
    }

    public HomePage foundationRonaldaBtn() {
        getClickableElementByXpath(FOUNDATION_RONALDA_BTN).click();
        return this;
    }

    public String getTextFoundationRonaldaTitle() {
        return getVisibilityElementByXpath(FOUNDATION_RONALDA_TITTLE).getText();
    }

    public String getLinkFromVisitSiteBtn() {
        return getVisibilityElementByXpath(VISIT_SITE_BTN).getAttribute("href");
    }
}
