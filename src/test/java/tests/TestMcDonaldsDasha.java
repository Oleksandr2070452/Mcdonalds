package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class TestMcDonaldsDasha extends TestInit {

    @Test(description = "SPAC-31")
    public void checkSearchField() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='item-text']")).click();
        driver.findElement(By.xpath("//input[@id='form-text-1673594539']")).sendKeys("BigMac");
        driver.findElement(By.xpath("//button[@id='button-93a5672f17']")).click();
        sleep(500);
        List<WebElement> searchResults = driver.findElements(By.xpath
                ("//h3[@class='cmp-site-search__result-container--heading']/a"));

        for (WebElement el : searchResults) {
            Assert.assertTrue(el.getText().toLowerCase().contains("біг мак"));
        }
    }

    @Test(description = "SPAC-32")
    public void checkBtnWorkPlace() throws InterruptedException {
        WebElement workPlaceBtn = driver.findElement(By.xpath("//span[contains(text(),'Робочі місця')]"));
        workPlaceBtn.click();
        WebElement workPlaceTitle = driver.findElement(By.xpath("//h1[contains(text(),'Робочі місця')]"));

        Assert.assertTrue(driver.getCurrentUrl().contains("/working_places.html"));
        Assert.assertTrue(workPlaceTitle.isDisplayed());
    }
}
