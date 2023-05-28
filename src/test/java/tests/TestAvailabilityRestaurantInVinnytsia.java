package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestAvailabilityRestaurantInVinnytsia extends TestInit {
    @Test(description = "SPAC-25")
    public void chekAvailabilityRestaurantInVinnytsia() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        WebElement getArrowInSliderMoveNext = driver.findElement(By.xpath("(//div[@class='cmp-teaser__content']/div[@class='cmp-teaser__action-container']/a[@class='cmp-teaser__action-link '])[3]"));

        for (int i = 0; i <= 3; i++) {
            getArrowInSliderMoveNext.click();
        }
    }
}
