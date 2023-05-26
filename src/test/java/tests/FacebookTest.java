package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class FacebookTest extends TestInit {
    @Test
    public void checkRedirectionOnFacebookTest() {
        HomePage homePage = new HomePage(driver);

        homePage.redirectionOnFacebookPage();

        assertTrue(driver.getCurrentUrl().contains("facebook.com/McDonaldsUA/"));

    }
}
