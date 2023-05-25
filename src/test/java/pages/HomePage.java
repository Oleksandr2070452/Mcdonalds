package pages;

import conditions.Conditions;
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
    public static final String LEARN_MORE_BTN = "//div/a[@href='https://ukraine.mcdonalds.ua/ukr/mcmode/']";
    public static final String FACEBOOK_BTN = "//img[@alt='Facebook']";
    public static final String TIK_TOK_BTN = "//img[@alt='Tiktok']";

    public WebElement getWorkInMcdonalds() {
        return driver.findElement(By.xpath(WORK_IN_MCDONALDS_BTN));
    }

    public WebElement getArrowInSliderMoveNext() {
        waitElement("//*[@id='teaser-4fd499e808']//a", Conditions.VISIBILITY);
        return driver.findElement(By.xpath(ARROW_IN_SLIDER_MOVE_NEXT));
    }

    public HomePage clickMultiplyClickArrowMoveNext() {
        for (int i = 0; i <= 1; i++) {
            getArrowInSliderMoveNext().click();
        }
        return this;
    }

    public WebElement getLearnMore() {
        return driver.findElement(By.xpath(LEARN_MORE_BTN));
    }

    public HomePage clickLearnMoreForOpenOurDoors() {
        jsClick(waitElement("//div/a[@href='https://ukraine.mcdonalds.ua/ukr/mcmode/']", Conditions.CLICKABLE),driver);

        if (driver.getCurrentUrl().contains("item-fcc42de051")) {
            getLearnMore().click();
        }
        return this;
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

    public WebElement getTikTokBtn() {
        return driver.findElement(By.xpath(TIK_TOK_BTN));
    }

    public HomePage redirectionOnTikTokPage() {
        scrollForElement(getTikTokBtn(), driver);
        getTikTokBtn().click();
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
        return this;
    }

    public WebElement getPauseBtn() {

        return driver.findElement(By.xpath("//button[@data-cmp-hook-carousel='pause']"));
    }

    public HomePage clickPauseBtn() {
        waitElement("//button[@data-cmp-hook-carousel='pause']", Conditions.VISIBILITY);
        getPauseBtn().click();
        return this;
    }

}
