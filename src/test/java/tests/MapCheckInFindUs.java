package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.FindUs;
import pages.HomePage;
import pages.MobileApp;

public class MapCheckInFindUs extends TestInit {
    @Test
    public void checkLogoButton() {
        HomePage homePage = new HomePage(driver);
        FindUs findUs = new FindUs(driver);

        findUs.getUrlFindUs();

        assertTrue(driver.findElement(By.xpath("//span[text()='Отримуй знижки та особливі пропозиції']")).isDisplayed());
    }
}