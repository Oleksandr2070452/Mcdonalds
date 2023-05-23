package tests;

import org.testng.annotations.Test;
import pages.FindUs;
import pages.HomePage;
import pages.LocationPage;

public class MapCheckInFindUsTest extends TestInit {
    private String resultURL = "https://www.mcdonalds.com/ua/uk-ua/location/3180116.html";
    private String resultAdress = "вул. Сухомлинського, 1";

    @Test
    public void MapCheckInFindUs() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        FindUs findUs = new FindUs(driver);
        LocationPage locationPage = new LocationPage(driver);

        homePage.clickFindUs();
        findUs.typeSearchFiled();
        findUs.clickSearchButton();
        findUs.getPortCity().click();

        String adress = locationPage.getLocationAdressText();
        assertEquals(driver.getCurrentUrl(), resultURL);
        assertTrue(adress.contains(resultAdress));
    }
}