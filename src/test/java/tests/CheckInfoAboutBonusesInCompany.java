package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckInfoAboutBonusesInCompany extends TestInit{
    @Test(description = "SPAC-24")
    public void checkInfoAboutBonusesInCompany() throws InterruptedException {
    driver.findElement(By.xpath("(//a[@href='/ua/uk-ua/to_know/mcd_career.html'])[2]")).click();
    driver.findElement(By.xpath("(//a[contains(text(),'Дізнатися більше')])[1]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Маєш запитання?')]")).click();
    driver.findElement(By.xpath("//div[contains(text(),'Оплата праці ')]")).click();

    WebElement infoElement = driver.findElement(By.xpath("(//div[contains(@class, 'faq_tab_element-item_accordion_title')]/span)[17]"));
    infoElement.click();
    WebElement bonusesInfoElement = driver.findElement(By.xpath("//p[text()=\"Так, у МакДональдз існують системи преміювання та заохочення працівників.\"]"));
    bonusesInfoElement.click();
    Assert.assertTrue(bonusesInfoElement.getText().contains("Так, у МакДональдз існують системи преміювання та заохочення працівників"));
    }
}
