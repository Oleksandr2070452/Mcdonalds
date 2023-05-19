package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class McdonaldsTestVadym extends TestInit {
    @Test
    public void checkRestaurantInLutskTest() throws InterruptedException {

        WebElement McDeliveryBtn = driver.findElement(By.xpath("//div[@class='cmp-global-header__primary-nav']//a[@href='/ua/uk-ua/mcdelivery.html']"));
        McDeliveryBtn.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,250)","");
        WebElement thereBtn = driver.findElement(By.xpath("//div[@class='main__delivery_info_glovo main__delivery_info_block']//a[@target='_blank']"));
        thereBtn.click();
        switchToTab(driver, 1);
        WebElement dropDownChooseTownRestaurant = driver.findElement(By.xpath("(//b[@class='button_select'])[1]"));
        dropDownChooseTownRestaurant.click();
//        WebElement scrollPanel = driver.switchTo().activeElement();

//        for(int i=0;i<=15; i++) {
//            scrollPanel.sendKeys(Keys.ARROW_DOWN);
//        }
        WebElement chooseTownDistrict = driver.findElement(By.xpath("//li[text()='Луцьк']"));
        chooseTownDistrict.click();

        String lutskMcDonaldsInfo = "просп. Соборності, 43 час роботи: 07:00 - 23:00";
        String lutskMDAddress = driver.findElement(By.xpath("//div[@class='restaurants__rest_address']/h4")).getText();
        String lutskMDWorkingHours = driver.findElement(By.xpath("//div[@class='restaurants__rest_address']/span")).getText();
        String lutskFinalInfo = lutskMDAddress + " " + lutskMDWorkingHours;
        System.out.println(lutskMcDonaldsInfo);
        System.out.println(lutskFinalInfo);

        assertEquals(lutskMcDonaldsInfo, lutskFinalInfo);
    }
}
