package tests;

import org.testng.annotations.Test;
import pages.FeedbackPage;
import pages.HomePage;

public class FeedbackTest extends TestInit {
    @Test
    public void checkRedirectionOnLeaveFeedbackPageTest() {

        HomePage homePage = new HomePage(driver);
        FeedbackPage feedbackPage = new FeedbackPage(driver);

        homePage.clickFeedBackBtn();
        feedbackPage.clickFormBtn();

        assertTrue(driver.getCurrentUrl().contains("ukr/feedback/"));
    }
}
