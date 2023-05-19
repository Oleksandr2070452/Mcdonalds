package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindUs extends BasePage{
    public FindUs(WebDriver driver) {
        super(driver);
    }
    public void getUrlFindUs(){
        driver.get("https://www.mcdonalds.com/ua/uk-ua/to_know/mcdonalds_in_ukraine/find_a_restaurant.html");
    }
}
