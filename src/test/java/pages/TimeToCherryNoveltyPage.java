package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TimeToCherryNoveltyPage extends BasePage {
    public TimeToCherryNoveltyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getMacFluriKitKatCherry() {
        return driver.findElement(By.xpath("//b[text()='МакФлурі®']"));
    }

    public boolean isDisplayedMacFluriKitKatCherry() {
        return getMacFluriKitKatCherry().isDisplayed();
    }

    public WebElement getMacSandiCherryChocolate() {
        return driver.findElement(By.xpath("//b[text()='МакСанді®']"));
    }

    public boolean isDisplayedMacSandiCherryChocolate() {
        return getMacSandiCherryChocolate().isDisplayed();
    }

    public WebElement getMacSandiCherry() {
        return driver.findElement(By.xpath("//b[text()='МакСанді®']"));
    }

    public boolean isDisplayedMacSandiCherry() {
        return getMacSandiCherry().isDisplayed();
    }

    public WebElement getIceAmericano() {
        return driver.findElement(By.xpath("//b[text()='Айс Американо']"));
    }

    public boolean isDisplayedIceAmericano() {
        return getIceAmericano().isDisplayed();
    }

    public WebElement getIceLate() {
        return driver.findElement(By.xpath("//b[text()='Айс Лате']"));
    }

    public boolean isDisplayedIceLate() {
        return getIceLate().isDisplayed();
    }

    public WebElement getLemonadeCherry() {
        return driver.findElement(By.xpath("//span[text()='Лимонад Вишня ']"));
    }

    public boolean isDisplayedLemonadeCherry() {
        return getLemonadeCherry().isDisplayed();
    }

    public WebElement getMacShakeCherry() {
        return driver.findElement(By.xpath("//span/b[text()='МакШейк® Вишня']"));
    }

    public boolean isDisplayedMacShakeCherry() {
        return getMacShakeCherry().isDisplayed();
    }
}

