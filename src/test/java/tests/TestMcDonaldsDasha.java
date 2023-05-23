package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;
import pages.MenuPage;
import pages.SearchPage;

import static elements.HomeElements.*;
import static java.lang.Thread.sleep;
import static utills.CommonAction.scrollDown;

public class TestMcDonaldsDasha extends TestInit {
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
        scrollDown(driver);
        WebElement googlePlayButton = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__apps']/div[2]"));
        googlePlayButton.click();
        switchToTab(driver, 1);

        assertTrue(driver.getCurrentUrl().contains("mcdonalds.mobileapp"));
    }

    @Test(description = "SPAC-39(36)")
    public void appStoreButtonTest() {
        HomePage homePage = new HomePage(driver);

        scrollDown(driver);
        homePage
                .clickAppStoreBtn();

        switchToTab(driver, 1);

        assertTrue(getUrl().contains("app/mcdonalds"));
        assertTrue(homePage.getAppHeaderTitle().contains("McDonald's"));
    }

    @Test(description = "SPAC-40(37)")
    public void instagramButtonTest() throws InterruptedException {
        scrollDown(driver);
        sleep(500);
        WebElement instagramButton = driver.findElement(By.xpath(
                "//div[@data-title='Instagram']/a"));
        instagramButton.click();
        switchToTab(driver, 1);
        sleep(1000);

        assertTrue(driver.getCurrentUrl().contains("instagram.com/mcdonaldsukraine/"));

        sleep(1000);

        String actualText = instagramHeader.getAttribute("aria-label");

        assertEquals(INSTAGRAM_LABEL, actualText);
    }

    @Test(description = "SPAC-41(38)")
    public void twitterButtonTest() throws InterruptedException {
        scrollDown(driver);
        sleep(500);
        WebElement twitterButton = driver.findElement(By.xpath("//div[@data-title='Twitter']"));
        twitterButton.click();
        switchToTab(driver, 1);
        sleep(1000);

        Assert.assertTrue(driver.getCurrentUrl().contains("/twitter.com/McDonaldsUA"));

        sleep(1000);
        WebElement twitterTittle = driver.findElement(By.xpath("//h2[@dir='ltr']"));

        Assert.assertTrue(twitterTittle.getText().contains("McDonald's"));
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
