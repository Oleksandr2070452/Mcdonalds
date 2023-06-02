package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends TestInit {
    @Test
    public void checkSliderInHomePageTest() {

        HomePage homePage = new HomePage(driver);

        homePage
                .clickPauseBtn();

        assertTrue(homePage.getPauseBtn().isDisplayed());
    }
}
