package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;
import pages.MenuPage;
import pages.SearchPage;

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
        WebElement workPlaceBtn = driver.findElement(By.xpath("//span[contains(text(),'Робочі місця')]"));
        workPlaceBtn.click();
        WebElement workPlaceTitle = driver.findElement(By.xpath("//h1[contains(text(),'Робочі місця')]"));

        assertTrue(driver.getCurrentUrl().contains("/working_places.html"));
        assertTrue(workPlaceTitle.isDisplayed());
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
    public void qnaTest() {

        WebElement qnaBtn = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__nav-links']//" +
                        "li[contains(@data-cmp-data-layer, 'zapitannja-ta-vidpovidi/')]"));
        qnaBtn.click();

        assertTrue(driver.getCurrentUrl().contains("/zapitannja-ta-vidpovidi/"));

        WebElement employmentButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='1']"));
        employmentButton.click();

        assertTrue(employmentButton.getAttribute("class").contains("active"));

        WebElement generalQuestionsButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='2']"));
        generalQuestionsButton.click();

        assertTrue(generalQuestionsButton.getAttribute("class").contains("active"));

        WebElement jobFeaturesButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='3']"));
        jobFeaturesButton.click();

        assertTrue(jobFeaturesButton.getAttribute("class").contains("active"));
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
        scrollDown(driver);
        WebElement appStoreButton = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__apps']/div[1]"));
        appStoreButton.click();
        switchToTab(driver, 1);

        assertTrue(driver.getCurrentUrl().contains("app/mcdonalds"));

        WebElement appHeader = driver.findElement(By.xpath(
                "//h1"));

        assertTrue(appHeader.getText().contains("McDonald's"));
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
        WebElement instagramHeader = driver.findElement(By.xpath(
                "//div[@class='_aagx']/*[name()='svg']"));

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