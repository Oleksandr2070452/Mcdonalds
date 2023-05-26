package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.OpenRestaurantPage;

public class FunctionalityOpenRestaurantTest extends TestInit {

    @Test
    public void checkLogoButton() {

        HomePage homePage = new HomePage(driver);
        OpenRestaurantPage openRestaurantPage = new OpenRestaurantPage(driver);

        homePage.clickOpenRestaurant();
        openRestaurantPage.clickChooseCityInstitution();
        openRestaurantPage.clickLutskInList();
        openRestaurantPage.clickChooseCentralDistrict();
        openRestaurantPage.clickCityDistrict();

        assertTrue(driver.findElement(By.xpath("//div[@class='restaurants__rest_address']")).isDisplayed());
    }
}
