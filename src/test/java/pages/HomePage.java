package pages;

import elements.HomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String WORK_IN_MCDONALDS_BTN = "//div[@id='teaser-d543114359']//a";
    public static final String ARROW_IN_SLIDER_MOVE_NEXT = "//button[@aria-label='Next']";
    public static final String LEARN_MORE_BTN = "//*[@id='teaser-4fd499e808']/div[2]/div[2]/a";
    public static final String FACEBOOK_BTN = "//img[@alt='Facebook']";

    public WebElement getWorkInMcdonalds() {
        return driver.findElement(By.xpath(WORK_IN_MCDONALDS_BTN));
    }

    public WebElement getArrowInSliderMoveNext() {
        return driver.findElement(By.xpath(ARROW_IN_SLIDER_MOVE_NEXT));
    }

    public WebElement getLearnMore() {
        return driver.findElement(By.xpath(LEARN_MORE_BTN));
    }

    public WebElement getFacebookBtn() {
        return driver.findElement(By.xpath(FACEBOOK_BTN));
    }

    public HomePage redirectionOnFacebookPage() {
        scrollForElement(getFacebookBtn(), driver);
        getFacebookBtn().click();
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
        return this;
    }

    public WebElement getMcDelivery() {
        return driver.findElement(By.xpath("//div[@class='cmp-global-header__primary-nav']//a[@href='/ua/uk-ua/mcdelivery.html']"));
    }

    public void clickMcDelivery() {
        getMcDelivery().click();
    }

    public WebElement getFindUs() {
        return driver.findElement(By.xpath("(//span[@class='icon icon-location'])[2]"));
    }

    public void clickFindUs() {
        getFindUs().click();
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

    public HomePage clickWorkPlaceBtn() {
        getClickableElementByXpath(WORK_PLACE_BTN).click();
        return this;
    }

    public String getTextWorkPlaceTitle() {
        return getVisibilityElementByXpath(WORK_PLACE_TITTLE).getText();
    }

    public HomePage clickQuestionAndAnswerBtn() {
        getClickableElementByXpath(QUESTION_AND_ANSWER_BTN).click();
        return this;
    }

    public HomePage selectTitle(String title) {
        getClickableElementByXpath(title).click();
        return this;
    }

    public String getLinkFromEmploymentBtn() {
        return getVisibilityElementByXpath(EMPLOYMENT_BTN).getAttribute("class");
    }

    public String getLinkFromGeneralQuestionsBtn() {
        return getVisibilityElementByXpath(GENERAL_QUESTION_BTN).getAttribute("class");
    }

    public String getLinkFromJobFeaturesBtn() {
        return getVisibilityElementByXpath(JOB_FEATURES_BTN).getAttribute("class");
    }

    public HomePage clickAppStoreBtn() {
        getClickableElementByXpath(APP_STORE_BTN).click();
        return this;
    }

    public HomePage clickInstagramBtn() {
        getClickableElementByXpath(INSTAGRAM_BTN).click();
        return this;
    }

    public HomePage clickGooglePlayBtn() {
        getClickableElementByXpath(GOOGLE_PLAY_BTN).click();
        return this;
    }

    public HomePage clickTwitterBtn() {
        getClickableElementByXpath(TWITTER_BTN).click();
        return this;
    }
}

