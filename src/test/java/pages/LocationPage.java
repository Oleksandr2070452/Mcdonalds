package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocationPage extends BasePage {
    public LocationPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getLocationAdress() {
        return driver.findElement(By.xpath("//div[@class='cmp-restaurant-detail__details-meta']"));
    }

    public String getLocationAdressText(){
        return getLocationAdress().getText();
    }
}