package tests;
import org.testng.annotations.Test;
import pages.CheckRestaurantPage;
import pages.HomePage;

public class CheckRestaurantTest extends TestInit {

    @Test
    public void restaurantTest() {

        HomePage homePage = new HomePage(driver);
        CheckRestaurantPage checkRestaurantPage = new CheckRestaurantPage(driver);

        homePage.clickPauseBtn();
        homePage.clickMultiplyClickArrowMoveNext();
        homePage.clickLearnMoreForOpenOurDoors();

        checkRestaurantPage
                .clickDropDownListTownRestaurant()
                .clickKyiv()
                .clickDropDownListYourDistrict()
                .clickToDarnitskuyDistrict()
                .clickRadioBtnOpenedNow();

        assertTrue(driver.getCurrentUrl().contains("/ukr/mcmode/"));

    }
}
