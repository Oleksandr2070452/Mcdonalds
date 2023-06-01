package pages;

import conditions.Conditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HelpForFamilyTogetherPage extends BasePage {
    public HelpForFamilyTogetherPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSupportFamiliesNow() {
        return driver.findElement(By.xpath("//div/div[1]/div[1]/ul/li[2]/a"));
    }

    public HelpForFamilyTogetherPage clickSupportFamiliesNow() {
        waitElement("//body/header/div/div[1]/ul/li[2]/a", Conditions.VISIBILITY);
        getSupportFamiliesNow().click();
        return this;
    }

    public WebElement getDonationHelpBtn() {
        return driver.findElement(By.xpath("//div[@id='support-now']/div/div/div[1]/div[2]/div/a"));
    }

    public HelpForFamilyTogetherPage clickDonationHelpBtn() {
        getDonationHelpBtn().click();
        return this;
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
