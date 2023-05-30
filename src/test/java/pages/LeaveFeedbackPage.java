package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeaveFeedbackPage extends BasePage {
    public LeaveFeedbackPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getNameField() {
        return driver.findElement(By.xpath("//input[@id='responseFullName']"));
    }

    public LeaveFeedbackPage setName() {
        scrollForElement(getNameField(), driver);
        waitElement("//input[@id='responseFullName']", Conditions.VISIBILITY);
        getNameField().sendKeys("Вова");
        return this;
    }

    public WebElement getPhoneNumberField() {
        return driver.findElement(By.xpath("//input[@id='responsePhone']"));
    }

    public LeaveFeedbackPage setPhoneNumber() {
        getPhoneNumberField().sendKeys("660785697");
        return this;
    }

    public WebElement getDropDownListChooseTopicAppeal() {
        return driver.findElement(By.xpath("//div[@class='response__custom-select_block']"));
    }

    public LeaveFeedbackPage clickDropDownListChooseTopicAppeal() {
        getDropDownListChooseTopicAppeal().click();
        return this;
    }

    public WebElement getExpressGratitude() {
        return driver.findElement(By.xpath("//span[@data-value='5']"));
    }

    public LeaveFeedbackPage chooseExpressGratitude() {
        waitElement("//span[@data-value='5']", Conditions.VISIBILITY);
        getExpressGratitude().click();
        return this;
    }

    public WebElement getDropDownListChooseRestaurant() {
        return driver.findElement(By.xpath("//label[@for='responseAddress']"));
    }

    public LeaveFeedbackPage clickDropDownListChooseRestaurant() {
        waitElement("//label[@for='responseAddress']", Conditions.VISIBILITY);
        getDropDownListChooseRestaurant().click();
        return this;
    }

    public WebElement getChooseRestaurantAddress() {
        return driver.findElement(By.xpath("//li[@data-index='1' and text()='вул. Набережна']"));
    }

    public LeaveFeedbackPage chooseRestaurantAddress() {
        waitElement("//li[@data-index='1' and text()='вул. Набережна']", Conditions.VISIBILITY);
        getChooseRestaurantAddress().click();
        return this;
    }

    public WebElement getDropDownListTowns() {
        return driver.findElement(By.xpath("//label[@for='responseCity']"));
    }

    public LeaveFeedbackPage clickDropDownListTowns() {
        waitElement("//label[@for='responseCity']", Conditions.VISIBILITY);
        getDropDownListTowns().click();
        return this;
    }

    public WebElement getTown() {
        return driver.findElement(By.xpath("//li[@data-index='5' and text()='Вишгород']"));
    }

    public LeaveFeedbackPage clickTown() {
        waitElement("//li[@data-index='5' and text()='Вишгород']", Conditions.VISIBILITY);
        getTown().click();
        return this;
    }

    public WebElement getDateField() {
        return driver.findElement(By.xpath("//input[@id='responseDate']"));
    }

    public LeaveFeedbackPage setDate() {
        getDateField().sendKeys("200923");
        return this;
    }

    public WebElement getTimeField() {
        return driver.findElement(By.xpath("//input[@id='responseTime']"));
    }

    public LeaveFeedbackPage setTime() {
        getTimeField().sendKeys("1022");
        return this;
    }

    public WebElement getAgreementBtn() {
        return driver.findElement(By.xpath("//label[@for='responseOk']"));
    }

    public LeaveFeedbackPage clickAgreementBtn() {
        waitElement("//label[@for='responseOk']", Conditions.VISIBILITY);
        getAgreementBtn().click();
        return this;
    }

    public WebElement getTextArea() {
        return driver.findElement(By.xpath("//textarea[@id='responseDesc']"));
    }

    public LeaveFeedbackPage setText() {
        getTextArea().sendKeys("Дуже раді відвати ваш заклад.Все дуже смачно!");
        return this;
    }

    public WebElement getSentBtn() {
        return driver.findElement(By.xpath("//button[@id='responseSend']"));
    }

    public LeaveFeedbackPage clickSentBtn() {
        getSentBtn().click();
        return this;
    }

    public WebElement getNoAvailabilityOfCheck() {
        return driver.findElement(By.xpath("//label[@for='check-false']"));
    }

    public LeaveFeedbackPage clickNoAvailabilityOfCheck() {
        waitElement("//label[@for='check-false']", Conditions.VISIBILITY);
        getNoAvailabilityOfCheck().click();
        return this;
    }

    public WebElement getCaptcha() {
        return driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));
    }

    public LeaveFeedbackPage clickCaptcha() {
        getCaptcha().click();
        return this;
    }

    public WebElement getIFrame() {
        return driver.findElement(By.xpath("//span[@id='recaptcha-anchor']"));

    }

    public LeaveFeedbackPage clickIFrame() {
        return this;
    }
}














