package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import static utills.CommonAction.scrollDownLess;

public class CrossingToReadBookTest extends TestInit{

    @Test
    public void checkLogoButton() {

        HomePage homePage = new HomePage(driver);

        scrollDownLess(driver);
        homePage.clickMoreToysInHappyMeal();
        scrollDownLess(driver);
        homePage.clickReadBookDetail();
        scrollDownLess(driver);

        assertTrue(driver.findElement(By.xpath("//*[@id=\"teaser-c630beacb2\"]")).isDisplayed());
    }
}
