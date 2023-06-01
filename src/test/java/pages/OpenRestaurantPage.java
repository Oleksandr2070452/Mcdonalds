package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OpenRestaurantPage extends BasePage {

    public OpenRestaurantPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getChooseCityInstitution() {
        return getClickableElementByXpath("(//div[@class='selectric'])[1]");
    }

    public void clickChooseCityInstitution() {
        getChooseCityInstitution().click();
    }

    public WebElement getLutskInList() {
        return getClickableElementByXpath("//div[@class='selectric-scroll']/ul/li[@data-index='13']");
    }

    public void clickLutskInList() {
        getLutskInList().click();
    }

    public WebElement getChooseCentralDistrict() {
        return getClickableElementByXpath("(//div[@class='selectric'])[2]");
    }

    public void clickChooseCentralDistrict() {
        getChooseCentralDistrict().click();
    }

    public WebElement getCityDistrict() {
        return getClickableElementByXpath("//div[@class='selectric-scroll']/ul/li[text()='Центральний']");
    }

    public void clickCityDistrict() {
        getCityDistrict().click();
    }
}
