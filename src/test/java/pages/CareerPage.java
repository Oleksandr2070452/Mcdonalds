package pages;

import conditions.Conditions;
import elements.CareerElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareerPage extends CareerElements {

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

    public CareerPage selectCity() {
        getClickableElementByXpath(CITY_DROPDOWN).click();
        getClickableElementByXpath(LUTSK_CITY).click();
        return this;
    }

    public CareerPage selectSchedule() {
        getClickableElementByXpath(SCHEDULE_DROPDOWN).click();
        getClickableElementByXpath(SCHEDULE_DAY).click();
        return this;
    }

    public CareerPage selectTime() {
        getClickableElementByXpath(CAN_WORK_DROPDOWN).click();
        getClickableElementByXpath(WORK_ANY_TIME);
        return this;
    }

    public CareerPage calculateSalary() {
        getClickableElementByXpath(COUNT_SALARY_BTN).click();
        return this;
    }

    public Double getPredictedSalary() {
     return Double.parseDouble(getVisibilityElementByXpath(PREDICTED_SALARY).getText()
             .replace(" грн.", ""));
    }

    public WebElement getLearnMoreBtn() {
        return getClickableElementByXpath(LEARN_MORE_BTN);
    }

    public WebElement getWantWorkBtn() {
        return getClickableElementByXpath(LEARN_MORE_BTN);
    }
}
