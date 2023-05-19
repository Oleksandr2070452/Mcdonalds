package pages;

import elements.CareerElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CareerPage extends CareerElements {
    public CareerPage(WebDriver driver) {
        super(driver);
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
