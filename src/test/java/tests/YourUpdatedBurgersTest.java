package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.YourUpdatedBurgersPage;

public class YourUpdatedBurgersTest extends TestInit {
    @Test
    public void checkBurgersTest() {

        HomePage homePage = new HomePage(driver);
        YourUpdatedBurgersPage yourUpdatedBurgersPage = new YourUpdatedBurgersPage(driver);

        homePage.clickLearnMoreForYourUpdatedBurgers();

        assertTrue(driver.getCurrentUrl().contains("special_offers/best_burgers"));
        assertTrue(yourUpdatedBurgersPage.isDisplayedBigMac());
        assertTrue(yourUpdatedBurgersPage.isDisplayedBigTasty());
        assertTrue(yourUpdatedBurgersPage.isDisplayedCheeseBurger());
        assertTrue(yourUpdatedBurgersPage.isDisplayedDoubleCheeseburger());
        assertTrue(yourUpdatedBurgersPage.isDisplayedFiletOFlash());
        assertTrue(yourUpdatedBurgersPage.isDisplayedGamburger());
        assertTrue(yourUpdatedBurgersPage.isDisplayedMacChicken());
    }
}
