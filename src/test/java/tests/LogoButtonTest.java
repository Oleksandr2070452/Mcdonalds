package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.MobileApp;

public class LogoButtonTest extends TestInit{
    @Test
    public void checkLogoButton(){
        HomePage homePage = new HomePage(driver);
        MobileApp mobileApp = new MobileApp(driver);

        mobileApp.getUrlMobileApp();
        mobileApp.clickLogoButton();
        assertTrue(driver.findElement( By.xpath("//span[text()='Отримуй знижки та особливі пропозиції']")).isDisplayed());
    }
}
