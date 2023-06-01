package pages;

import conditions.Conditions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class BasePage {

    public static WebDriver driver;
    public JavascriptExecutor javascriptExecutor;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofMillis(5000));
    }

    protected WebElement waitElement(String locator, Conditions conditions) {
        switch (conditions) {
            case CLICKABLE:
                try {
                    return wait.until(elementToBeClickable(By.xpath(locator)));
                } catch (WebDriverException ignored) {
                }
            case VISIBILITY:
                try {
                    return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
                } catch (WebDriverException ignored) {
                }
            default:
                try {
                    return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
                } catch (WebDriverException ignored) {
                }
        }
        return null;
    }

    protected List<WebElement> waitElements(String locator, Conditions conditions) {
        if (conditions == Conditions.VISIBILITY) {
            try {
                return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(locator)));
            } catch (WebDriverException ignored) {
            }
        }
        try {
            return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
        } catch (WebDriverException ignored) {
        }
        return null;
    }

    protected WebElement getVisibilityElementByXpath(String locator) {
        return waitElement(locator, Conditions.VISIBILITY);
    }

    protected List<WebElement> getVisibilityOfElementsByXpath(String locator) {
        return waitElements(locator, Conditions.VISIBILITY);
    }

    protected boolean waitInvisibilityOfElementLocated(String locator) {
        try {
            return wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
        } catch (WebDriverException e) {
            return false;
        }
    }

    protected WebElement getClickableElementByXpath(String locator) {
        return waitElement(locator, Conditions.CLICKABLE);
    }

    protected WebElement getElementByXpath(String locator) {
        return waitElement(locator, Conditions.PRESENT);
    }

    protected List<WebElement> getElementsByXpath(String locator) {
        return waitElements(locator, Conditions.PRESENT);
    }

    public static void scrollForElement(WebElement element, WebDriver driver) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void jsClick(WebElement element, WebDriver driver) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }
    protected WebElement waitUntilElementToBeClickableByXpath(String locator) {
        return wait.until(elementToBeClickable(By.xpath(locator)));
    }
    public static void movEToNextWindow(){
        ArrayList<String> switchToWindow = new ArrayList<>
                (driver.getWindowHandles());
        driver.switchTo().window(switchToWindow.get(1));
    }
}
