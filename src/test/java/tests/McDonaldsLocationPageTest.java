package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class McDonaldsLocationPageTest extends TestInit {

    @Test(description = "SPAC-25")
    public void testMcDonaldsLocationPage() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//button[@aria-label='Next']")).click();
        }
        sleep(2000);
        driver.findElement(By.xpath("//a[@href='https://ukraine.mcdonalds.ua/ukr/mcdelivery/']")).click();
        sleep(2000);

        assertTrue(driver.getCurrentUrl().contains("https://ukraine.mcdonalds.ua/ukr/mcdelivery/"));
    }
}
