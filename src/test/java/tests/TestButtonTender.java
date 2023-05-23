package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestButtonTender extends TestInit{
    @Test(description = "SPAC-22")
    public void checkButtonTender() throws InterruptedException {
        driver.findElement(By.xpath("(//span[contains(text(),'Тендери')])[1]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Завантажити')]")).click();
    }
}

