package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class TikTokTest extends TestInit {
    @Test
    public void redirectionOnTikTokTest() {
        HomePage homePage = new HomePage(driver);

        homePage.redirectionOnTikTokPage();

        assertTrue(driver.getCurrentUrl().contains("tiktok.com/@mcdonaldsukraine"));
    }
}
