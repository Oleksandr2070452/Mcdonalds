package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import static utills.CommonAction.scrollDownLess;

public class CrossingDeliverFavoriteTest extends TestInit{
    @Test
    public void checkLogoButton() {

        HomePage homePage = new HomePage(driver);

        scrollDownLess(driver);
        homePage.clickDeliverFavorite();
        scrollDownLess(driver);
        assertTrue(driver.findElement(By.xpath("//div[@style='text-align:center;']")).isDisplayed());
    }
}
