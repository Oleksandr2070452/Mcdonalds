package utills;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonAction {
    public static void scrollForElement(WebElement element, WebDriver drv) throws InterruptedException {
        ((JavascriptExecutor) drv).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(200);
    }

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,800000)");
    }
<<<<<<< HEAD
=======

    public static void scrollDownLess(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)");
    }
>>>>>>> 0feced4b7c26569312b9699fc3d5797a5a4ef08a
}
