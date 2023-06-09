package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class McDelivery extends BasePage {
    Actions move = new Actions(driver);

    public McDelivery(WebDriver driver) {
        super(driver);
    }

    public WebElement getSelectCityButton() {
        return driver.findElement(By.xpath("//b[@class='button_select']"));
    }

    public void clickCityButton() {
        getSelectCityButton().click();
    }

    public WebElement getVinnytsia() {
        return driver.findElement(By.xpath("//li[@data-index='4']"));
    }

    public void clickVinnytsia() {
        waitElement("//li[@data-index='4']", Conditions.VISIBILITY);
        getVinnytsia().click();
    }


    public WebElement getLocationCity() {
        return driver.findElement(By.xpath("//div[@class='selectric-scroll ps-container ps-theme-default ps-active-y'] | //div[@class='selectric-scroll ps-container ps-theme-default']/ul"));
    }

    public String getLocationCityText() {
        return getLocationCity().getText();
    }
}
