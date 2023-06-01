package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;

import static utills.CommonAction.scrollDownLess;

public class CheckingListOfToysTest extends TestInit {
    @Test
    public void checkingListOfToys() {

        HomePage homePage = new HomePage(driver);

        scrollDownLess(driver);
        homePage.clickMoreToysInHappyMeal();
        scrollDownLess(driver);
        assertTrue(driver.findElement(By.xpath("//div[@class='cmp-teaser__title']/h4")).isDisplayed());
    }
}
