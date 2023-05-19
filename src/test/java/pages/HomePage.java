package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public static final String WORK_IN_MCDONALDS_BTN = "//div[@id='teaser-d543114359']//a";
    public static final String ARROW_IN_SLIDER_MOVE_NEXT = "//button[@aria-label='Next']";
    public static final String LEARN_MORE_BTN = "//*[@id='teaser-4fd499e808']/div[2]/div[2]/a";
    public static final String FACEBOOK_BTN = "//img[@alt='Facebook']";

    public WebElement getWorkInMcdonalds() {
        return driver.findElement(By.xpath(WORK_IN_MCDONALDS_BTN));
    }

    public WebElement getArrowInSliderMoveNext() {
        return driver.findElement(By.xpath(ARROW_IN_SLIDER_MOVE_NEXT));
    }

    public WebElement getLearnMore() {
        return driver.findElement(By.xpath(LEARN_MORE_BTN));
    }

    public WebElement getFacebookBtn() {
        return driver.findElement(By.xpath(FACEBOOK_BTN));
    }

    public HomePage redirectionOnFacebookPage() {
        scrollForElement(getFacebookBtn(), driver);
        getFacebookBtn().click();
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
        return this;
    }
}
