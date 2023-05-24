package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindUs extends BasePage {
    public FindUs(WebDriver driver) {
        super(driver);
    }

    private static final String CITY_LINK = "//a[@href='/ua/uk-ua/location/3180116.html']";

    public WebElement getSearchFiled() {
        return driver.findElement(By.xpath("//input[@id='form-text-1673594539']"));
    }

    public void typeSearchFiled() {
        getSearchFiled().sendKeys("Луцьк");
    }

    public WebElement getSearchButton() {
        return getClickableElementByXpath("//button[@id='button-93a5672f18']");
    }

    public void clickSearchButton() {
        getSearchButton().click();
    }

    public WebElement getPortCity() {
        return getClickableElementByXpath(CITY_LINK);
    }
}
