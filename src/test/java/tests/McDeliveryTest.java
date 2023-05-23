package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.McDelivery;

public class McDeliveryTest extends TestInit {

    @Test
    public void checkMcDelivery() {

        HomePage homePage = new HomePage(driver);
        McDelivery mcDelivery = new McDelivery(driver);

        homePage.clickMcDelivery();
        mcDelivery.clickCityButton();
        mcDelivery.clickVinnytsia();

        assertTrue(driver.findElement(By.xpath("//img[@src='/media/image/glovo/map_Vinnycya_preview.jpg']")).isDisplayed());
    }
}