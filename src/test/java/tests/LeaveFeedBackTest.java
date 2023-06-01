package tests;

import org.testng.annotations.Test;
import pages.FeedbackPage;
import pages.HomePage;
import pages.LeaveFeedbackPage;

public class LeaveFeedBackTest extends TestInit {
    @Test
    public void feedBackTest() {

        HomePage homePage = new HomePage(driver);
        FeedbackPage feedbackPage = new FeedbackPage(driver);
        LeaveFeedbackPage leaveFeedbackPage = new LeaveFeedbackPage(driver);

        homePage.clickFeedBackBtn();

        assertTrue(driver.getCurrentUrl().contains("/feedback"));

        feedbackPage.clickFormBtn();


        leaveFeedbackPage
                .setName()
                .setPhoneNumber()
                .clickDropDownListChooseTopicAppeal()
                .chooseExpressGratitude()
                .clickDropDownListTowns()
                .clickTown()
                .clickDropDownListChooseRestaurant()
                .chooseRestaurantAddress()
                .setDate()
                .setTime()
                .setText()
                .clickAgreementBtn()
                .clickNoAvailabilityOfCheck()
                .clickSentBtn();


        assertTrue(leaveFeedbackPage.getAgreementBtn().isDisplayed());
        assertTrue(leaveFeedbackPage.getNoAvailabilityOfCheck().isDisplayed());

    }
}
