package tests;

import org.testng.annotations.Test;
import pages.HelpForFamilyTogetherPage;
import pages.HomePage;

public class HelpForFamilyTogetherTest extends TestInit {
    @Test
    public void checkRedirectionTest() {

        HomePage homePage = new HomePage(driver);

        homePage.clickArrowMovePrevious()
                .clickLearnMoreBtnForHelpForFamilyTogatherPage();

        assertTrue(driver.getCurrentUrl().contains("donate/?dest=rooms"));
    }

    @Test
    public void checkHelpForFamilyTogetherTest() {


        HomePage homePage = new HomePage(driver);
        HelpForFamilyTogetherPage helpForFamilyTogetherPage = new HelpForFamilyTogetherPage(driver);

        homePage
                .clickArrowMovePrevious()
                .clickLearnMoreBtnForHelpForFamilyTogatherPage();

        helpForFamilyTogetherPage
                .clickSumDonation25grn()
                .clickMakeDonateBtn();

        assertTrue(driver.getCurrentUrl().contains("liqpay.ua/uk/checkout/card/checkout"));

    }
}
