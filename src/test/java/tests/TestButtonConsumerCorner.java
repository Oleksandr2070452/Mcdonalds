package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestButtonConsumerCorner extends TestInit {
    @Test(description = "SPAC-23")
    public void CheckButtonConsumerCorner() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(),'Якість та гігієна')])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Дізнатись більше')])[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Куточок споживача')]")).click();
    }
}
