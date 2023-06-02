package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpForFamilyTogetherPage extends BasePage {
    public HelpForFamilyTogetherPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSumDonation25grn() {
        return driver.findElement(By.xpath("//span[@data-value='25']"));
    }

    public HelpForFamilyTogetherPage clickSumDonation25grn() {
        getSumDonation25grn().click();
        return this;
    }

    public WebElement getMakeDonateBtn() {
        return driver.findElement(By.xpath("//div[@class='pay-popup-send-btn']"));
    }

    public HelpForFamilyTogetherPage clickMakeDonateBtn() {
        getMakeDonateBtn().click();
        waitElement("//div[@class='pay-popup-send-btn']", Conditions.VISIBILITY);
        return this;
    }
}
