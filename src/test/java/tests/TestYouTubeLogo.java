package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static utills.CommonAction.scrollDown;

public class TestYouTubeLogo extends TestInit {
    @Test(description = "SPAC-27")
    public void checkButtonYouTubeLogo() throws InterruptedException {
        scrollDown(driver);
        sleep(500);
        driver.findElement(By.xpath("(//img[@class='cmp-image__image'])[20]")).click();
        switchToTab(driver, 1);

        assertTrue(driver.getCurrentUrl().contains("https://www.youtube.com/user/mcdonaldsua"));
    }
}
