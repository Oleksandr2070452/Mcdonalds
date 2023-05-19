package pages;

import conditions.Conditions;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.spi.LoggerFactoryBinder;

import java.time.Duration;
import java.util.List;
@Slf4j
public class BasePage {
    public WebDriver driver;

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
                    return wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
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

    public static void scrollToElement() {

    }

}

