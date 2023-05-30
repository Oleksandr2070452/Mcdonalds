package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class YourUpdatedBurgersPage extends BasePage {
    public YourUpdatedBurgersPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getBigMac() {
        return driver.findElement(By.xpath("//span[text()='Біг Мак®']"));
    }

    public boolean isDisplayedBigMac() {
        return getBigMac().isDisplayed();
    }

    public WebElement getBigTasty() {
        return driver.findElement(By.xpath("//span[text()='Біг Тейсті®']"));
    }

    public boolean isDisplayedBigTasty() {
        return getBigTasty().isDisplayed();
    }

    public WebElement getDoubleCheeseburger() {
        return driver.findElement(By.xpath("//span[text()='Дабл Чізбургер']"));
    }

    public boolean isDisplayedDoubleCheeseburger() {
        return getDoubleCheeseburger().isDisplayed();
    }

    public WebElement getMacChicken() {
        return driver.findElement(By.xpath("//span[text()='МакЧікен®']"));
    }

    public boolean isDisplayedMacChicken() {
        return getMacChicken().isDisplayed();
    }

    public WebElement getFiletOFlash() {
        return driver.findElement(By.xpath("//span[text()='Філе-о-Фіш®']"));
    }

    public boolean isDisplayedFiletOFlash() {
        return getFiletOFlash().isDisplayed();
    }

    public WebElement getCheeseBurger() {
        return driver.findElement(By.xpath("//span[text()='Чізбургер']"));
    }

    public boolean isDisplayedCheeseBurger() {
        return getCheeseBurger().isDisplayed();
    }

    public WebElement getGamburger() {
        return driver.findElement(By.xpath("//span[text()='Гамбургер']"));
    }

    public boolean isDisplayedGamburger() {
        return getGamburger().isDisplayed();
    }
}
