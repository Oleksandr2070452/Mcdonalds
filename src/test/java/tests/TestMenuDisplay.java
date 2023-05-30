package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestMenuDisplay extends TestInit {
    @Test(description = "SPAC-26")
    public void testMenuDisplay() throws InterruptedException {
        driver.findElement(By.xpath("(//li[@class=\"cmp-navigation__item cmp-navigation__item--level-0 \"])[2]")).click();
        driver.findElement(By.xpath("(//a[contains(text(),'Переглянути повне меню')])[4]")).click();
        driver.findElement(By.xpath("//img[@id='product-category-e073fc1adf-00e710e000_image']")).click();

        assertTrue(driver.getCurrentUrl().contains("https://www.mcdonalds.com/ua/uk-ua/product/200154.html"));
    }
}
