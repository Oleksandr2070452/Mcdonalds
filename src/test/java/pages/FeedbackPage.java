package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class FeedbackPage extends BasePage{
    public FeedbackPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getFormBtn() {
        return driver.findElement(By.xpath("//a[text()='Форма']"));
    }
    public FeedbackPage clickFormBtn() {
        getFormBtn().click();
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
        return this;
    }
}
