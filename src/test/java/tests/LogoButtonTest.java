package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.MobileApp;

public class LogoButtonTest extends TestInit {

    @Test
    public void checkLogoButton() {

        MobileApp mobileApp = new MobileApp(driver);

        mobileApp.getUrlMobileApp();
        mobileApp.clickLogoButton();
        assertTrue(driver.findElement(By.xpath("//span[text()='Отримуй знижки та особливі пропозиції']")).isDisplayed());
    }
}