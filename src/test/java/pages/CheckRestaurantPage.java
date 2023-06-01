package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class CheckRestaurantPage extends BasePage {
    public CheckRestaurantPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getChooseTownRestaurant() {
        return driver.findElement(By.xpath("//b[@class='button_select']"));
    }

    public CheckRestaurantPage clickDropDownListTownRestaurant() {
        waitElement("//b[@class='button_select']", Conditions.VISIBILITY);
        getChooseTownRestaurant().click();
        return this;
    }

    public WebElement getTownKyiv() {
        return driver.findElement(By.xpath("//li[@data-index='10']"));
    }

    public CheckRestaurantPage clickKyiv() {
        getTownKyiv().click();
        return this;
    }

    public WebElement getDropDownListYourDistrict() {
        return driver.findElement(By.xpath("//div[@id='rest_region_wrapper']//div[@class='selectric']"));
    }

    public CheckRestaurantPage clickDropDownListYourDistrict() {
        waitElement("//div[@id='rest_region_wrapper']//div[@class='selectric']", Conditions.VISIBILITY);
        getDropDownListYourDistrict().click();
        return this;
    }

    public WebElement getToDarnitskuyDistrict() {
        return driver.findElement(By.xpath("//li[@data-index='2' and text()='Дарницький']"));
    }

    public CheckRestaurantPage clickToDarnitskuyDistrict() {
        waitElement("//li[@data-index='2' and text()='Дарницький']", Conditions.VISIBILITY);
        scrollForElement(getToDarnitskuyDistrict(), driver);
        getToDarnitskuyDistrict().click();
        return this;
    }

    public WebElement getRadioBtnOpenedNow() {
        return driver.findElement(By.xpath("//label[@for='opened_only']"));
    }

    public CheckRestaurantPage clickRadioBtnOpenedNow() {
        getRadioBtnOpenedNow().click();
        return this;
    }

    public List<WebElement> openRestaurants() {
        return driver.findElements(By.xpath("//span[@class='status_on' and text()='відкрито']"));
    }
}
