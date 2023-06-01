package pages;

import conditions.Conditions;
import elements.HomeElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;


public class HomePage extends HomeElements {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getReadBookDetail() {
        return driver.findElement(By.xpath(READ_BOOK_DETAIL));
    }

    public void clickReadBookDetail() {
        getReadBookDetail().click();
    }

    public HomePage clickMultiplyClickArrowMoveNext() {
        for (int i = 0; i <= 1; i++) {
            getArrowInSliderMoveNext().click();
        }
        return this;
    }

    public WebElement getArrowInSliderMovePrevious() {
        return driver.findElement(By.xpath("//button[@class='cmp-carousel__action cmp-carousel__action--previous']"));

    }

    public HomePage clickArrowMovePrevious() {
        getArrowInSliderMovePrevious().click();
        return this;
    }

    public HomePage clickLearnMoreForOpenOurDoors() {
        jsClick(waitElement("//div/a[@href='https://ukraine.mcdonalds.ua/ukr/mcmode/']", Conditions.CLICKABLE), driver);

        if (driver.getCurrentUrl().contains("item-fcc42de051")) {
            getLearnMore().click();
        }
        return this;
    }

    public WebElement getWorkInMcdonalds() {
        return driver.findElement(By.xpath(WORK_IN_MCDONALDS_BTN));
    }

    public void clickInfluenceStrategy() {
        getClickableElementByXpath(INFLUENCE_STRATEGY).click();
    }

    public HomePage clickDeliverFavorite() {
        getClickableElementByXpath(DELIVER_FAVORITE_DETAILS).click();
        return this;
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
        waitElement("//img[@alt='Facebook']", Conditions.VISIBILITY);
        getFacebookBtn().click();
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
        return this;
    }

    public WebElement getTikTokBtn() {
        return driver.findElement(By.xpath(TIK_TOK_BTN));
    }


    public HomePage redirectionOnTikTokPage() {
        scrollForElement(getTikTokBtn(), driver);
        waitElement("//img[@alt='Tiktok']", Conditions.VISIBILITY);
        getTikTokBtn().click();
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

    public HomePage clickOpenRestaurant() {
        getClickableElementByXpath(OPEN_RESTAURANT).click();
        return this;
    }

    public WebElement getMoreToysInHappyMeal() {
        return driver.findElement(By.xpath(MORE_HAPPY_MEAL));
    }

    public void clickMoreToysInHappyMeal() {
        getMoreToysInHappyMeal().click();
    }

    public WebElement getPauseBtn() {
        return driver.findElement(By.xpath("//button[@data-cmp-hook-carousel='pause']"));
    }

    public HomePage clickPauseBtn() {
        waitElement("//button[@data-cmp-hook-carousel='pause']", Conditions.VISIBILITY);
        getPauseBtn().click();
        return this;
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

    public HomePage clickGooglePlayBtn() {
        getClickableElementByXpath(GOOGLE_PLAY_BTN).click();
        return this;
    }

    public HomePage clickTwitterBtn() {
        getClickableElementByXpath(TWITTER_BTN).click();
        return this;
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

    public WebElement getFeedBackBtn() {
        return driver.findElement(By.xpath("//li[1]/div[2]/div/ul/li[2]/a/span"));
    }

    public HomePage clickFeedBackBtn() {
        getFeedBackBtn().click();
        return this;
    }

    public WebElement getLearnMoreBtnForHelpForFamilyTogatherPage() {
        return driver.findElement(By.xpath("//a[@href='https://rmhc.org.ua/donate/?dest=rooms']"));
    }

    public HomePage clickLearnMoreBtnForHelpForFamilyTogatherPage() {
        waitElement("//a[@href='https://rmhc.org.ua/donate/?dest=rooms']", Conditions.VISIBILITY);
        getLearnMoreBtnForHelpForFamilyTogatherPage().click();
        movEToNextWindow();
        return this;
    }

    public WebElement getLearnMoreForCherrryNoveltyPage() {
        return driver.findElement(By.xpath("//a[@href='/ua/uk-ua/eat/novelty/fresh-cherry.html']"));
    }

    public HomePage clickLearnMoreForCherrryNoveltyPage() {
        waitElement("//a[@href='/ua/uk-ua/eat/novelty/fresh-cherry.html']", Conditions.VISIBILITY);
        getLearnMoreForCherrryNoveltyPage().click();
        return this;
    }

    public WebElement getLearnMoreForYourUpdatedBurgers() {
        return driver.findElement(By.xpath("//a[@href='/ua/uk-ua/eat/special_offers/best_burgers.html']"));
    }

    public HomePage clickLearnMoreForYourUpdatedBurgers() {
        getLearnMoreForYourUpdatedBurgers().click();
        return this;
    }
}
