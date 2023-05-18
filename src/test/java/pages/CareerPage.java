package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareerPage extends BasePage {
    public CareerPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDropDownTownList() {
        return driver.findElement(By.xpath("//span[text()='Обери місто']"));
    }

    public CareerPage clickDropDownTownList() {
        getDropDownTownList().click();
        return this;
    }

    public WebElement getTown() {
        return driver.findElement(By.xpath("//li[text()='Бровари']"));
    }

    public CareerPage clickOnTown() {
        getTown().click();
        return this;
    }

    public WebElement getDropDownRestaurantList() {
        return driver.findElement(By.xpath("//div/span[text()='Обери ресторан']"));
    }

    public CareerPage clickOnRestaurantDropDownList() {
        getDropDownRestaurantList().click();
        return this;
    }

    public WebElement getRestaurantAddress() {
        return driver.findElement(By.xpath("//li[text()='Спартак, вул. Київська, 239']"));
    }

    public CareerPage clickOnRestaurantAddress() {
        waitElement("//li[text()='Спартак, вул. Київська, 239']", Conditions.VISIBILITY);
        getRestaurantAddress().click();
        return this;
    }

    public WebElement getFillQuestionnaireBtn() {
        return driver.findElement(By.xpath("//a[@data-id='2463']"));
    }

    public CareerPage clickFillQuestionnaireBtn() {
        getFillQuestionnaireBtn().click();
        return this;
    }

    public WebElement getCareerTitle() {
        return driver.findElement(By.xpath("//div[@class='header_title']"));
    }
}
