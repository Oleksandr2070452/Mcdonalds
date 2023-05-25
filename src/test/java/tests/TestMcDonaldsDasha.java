package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

import static elements.HomeElements.*;
import static java.lang.Thread.sleep;
import static utills.CommonAction.scrollDown;

public class TestMcDonaldsDasha extends TestInit {

    private static final String INSTAGRAM_LABEL = "Instagram";

    @Test(description = "SPAC-31")
    public void checkSearchFieldTest() {
        SearchPage searchPage = new SearchPage(driver);

        new HomePage(driver)
                .clickSearchBtn();

        searchPage
                .setSearchData("BigMac")
                .clickSearchBtn();

        for (WebElement el : searchPage.getListResult()) {
            assertTrue(el.getText().toLowerCase().contains("біг мак"));
        }
    }

    @Test(description = "SPAC-32")
    public void btnWorkPlaceTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickWorkPlaceBtn();

        assertTrue(getUrl().contains("/working_places.html"));
        assertEquals(homePage.getTextWorkPlaceTitle(), "Робочі місця, рівність та розширення можливостей");
    }

    @Test(description = "SPAC-33")
    public void mcDonaldsSalaryCalculatorTest() {
        CareerPage careerPage = new CareerPage(driver);

        new HomePage(driver)
                .clickSalaryCalculatorBtn();

        careerPage
                .selectCity()
                .selectSchedule()
                .selectTime()
                .calculateSalary();

        assertTrue(careerPage.getPredictedSalary() > 0);
        assertTrue(careerPage.getLearnMoreBtn().isDisplayed());
        assertTrue(careerPage.getWantWorkBtn().isDisplayed());
    }

    @Test(description = "SPAC-34")
    public void questionAndAnswerTest() {
        HomePage homePage = new HomePage(driver);

        homePage
                .clickQuestionAndAnswerBtn()
                .selectTitle(EMPLOYMENT_BTN);

        assertTrue(getUrl().contains("/zapitannja-ta-vidpovidi/"));
        assertTrue(homePage.getLinkFromEmploymentBtn().contains("active"));

        homePage
                .selectTitle(GENERAL_QUESTION_BTN);

        assertTrue(homePage.getLinkFromGeneralQuestionsBtn().contains("active"));

        homePage
                .selectTitle(GENERAL_QUESTION_BTN);

        assertTrue(homePage.getLinkFromJobFeaturesBtn().contains("active"));
    }

    @Test(description = "SPAC-35")
    public void googlePlayButtonTest() {
        HomePage homePage = new HomePage(driver);
        GooglePlayPage googlePlayPage = new GooglePlayPage(driver);

        scrollDown(driver);
        homePage
                .clickGooglePlayBtn();

        switchToTab(driver, 1);

        assertTrue(getUrl().contains("mcdonalds.mobileapp"));
        assertTrue(googlePlayPage.getGooglePlayTitle().contains("McDonald's"));
    }

    @Test(description = "SPAC-39(36)")
    public void appStoreButtonTest() {
        HomePage homePage = new HomePage(driver);
        AppStorePage appStorePage = new AppStorePage(driver);

        scrollDown(driver);
        homePage
                .clickAppStoreBtn();

        switchToTab(driver, 1);

        assertTrue(getUrl().contains("app/mcdonalds"));
        assertTrue(appStorePage.getAppHeaderTitle().contains("McDonald's"));
    }

    @Test(description = "SPAC-40(37)")
    public void instagramButtonTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        InstagramPage instagramPage = new InstagramPage(driver);

        scrollDown(driver);
        homePage
                .clickInstagramBtn();

        switchToTab(driver, 1);

        assertTrue(getUrl().contains("instagram.com/mcdonaldsukraine/"));
        assertEquals(instagramPage.getLinkFromInstagramBtn(), "Instagram");
    }

    @Test(description = "SPAC-41(38)")
    public void twitterButtonTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        TwitterPage twitterPage = new TwitterPage(driver);

        scrollDown(driver);
        homePage
                .clickTwitterBtn();

        switchToTab(driver, 1);

        assertTrue(getUrl().contains("/twitter.com/McDonaldsUA"));
        assertTrue(twitterPage.getTwitterTitle().contains("McDonald's"));
    }

    @Test(description = "SPAC-42(39)")
    public void fullMenuBtnTest() throws InterruptedException {

        new HomePage(driver)
                .clickMenuBtn()
                .clickFullMenuBtn();

        assertTrue(new MenuPage(driver).getNumberOfMenuItems().size() > 30);
    }

    @Test(description = "SPAC-43")
    public void foundationRonaldaBtnTest() throws InterruptedException {
        HomePage homePage = new HomePage(driver);

        homePage
                .foundationRonaldaBtn();

        assertTrue(getUrl().contains("/impact_strategy/"));
        assertEquals(homePage.getTextFoundationRonaldaTitle(), "Фундація Дім Рональда МакДональда");
        assertEquals(homePage.getLinkFromVisitSiteBtn(), "http://rmhc.org.ua/");
    }
}
