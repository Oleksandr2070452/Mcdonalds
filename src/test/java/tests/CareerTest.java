package tests;

import org.testng.annotations.Test;
import pages.CareerPage;
import pages.HomePage;

public class CareerTest extends TestInit {
    @Test
    public void checkRedirectionOnPage() {

        HomePage homePage = new HomePage(driver);
        homePage.getWorkInMcdonalds().click();

        assertTrue(driver.getCurrentUrl().contains("robota-v-makdonaljdz/"));
    }

    @Test
    public void checkCareerTest() {

        HomePage homePage = new HomePage(driver);
        CareerPage careerPage = new CareerPage(driver);

        homePage.getWorkInMcdonalds().click();
        careerPage
                .clickDropDownTownList()
                .clickOnTown()
                .clickOnRestaurantDropDownList()
                .clickOnRestaurantAddress()
                .clickFillQuestionnaireBtn();

        assertTrue(careerPage.getCareerTitle().getText().contains("Кар'єра"));
    }
}
