package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static utills.CommonAction.scrollDown;

public class TestButtonTermsAndConditions extends TestInit {
    @Test(description = "SPAC-28")
    public void checkButtonTermsAndConditions() throws InterruptedException {
        scrollDown(driver);
        sleep(500);
        driver.findElement(By.xpath("//span[contains(text(),'Положення та умови')]")).click();

        assertTrue(driver.getCurrentUrl().contains("https://www.mcdonalds.com/ua/uk-ua/terms-and-conditions.html"));
    }
}
