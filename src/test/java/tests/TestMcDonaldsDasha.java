package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

import static java.lang.Thread.sleep;

public class TestMcDonaldsDasha extends TestInit {

    @Test(description = "SPAC-31")
    public void checkSearchFieldTest() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class='item-text']")).click();
        driver.findElement(By.xpath("//input[@id='form-text-1673594539']")).sendKeys("BigMac");
        driver.findElement(By.xpath("//button[@id='button-93a5672f17']")).click();
        sleep(500);
        List<WebElement> searchResults = driver.findElements(By.xpath
                ("//h3[@class='cmp-site-search__result-container--heading']/a"));

        for (WebElement el : searchResults) {
            assertTrue(el.getText().toLowerCase().contains("біг мак"));
        }
    }

    @Test(description = "SPAC-32")
    public void btnWorkPlaceTest() throws InterruptedException {
        WebElement workPlaceBtn = driver.findElement(By.xpath("//span[contains(text(),'Робочі місця')]"));
        workPlaceBtn.click();
        WebElement workPlaceTitle = driver.findElement(By.xpath("//h1[contains(text(),'Робочі місця')]"));

        assertTrue(driver.getCurrentUrl().contains("/working_places.html"));
        assertTrue(workPlaceTitle.isDisplayed());
    }

    @Test(description = "SPAC-33")
    public void mcDonaldsSalaryCalculatorTest() {
        WebElement salaryCalculatorButton = driver.findElement(By.xpath(
                "//span[contains(text(),'Зарплатний калькулятор')]"));
        salaryCalculatorButton.click();

        WebElement dropDownBtn = driver.findElement(By.xpath(
                "//label[@for='calc-city']/following-sibling::div//b"));
        dropDownBtn.click();
        WebElement citySelect = driver.findElement(By.xpath("//li[@data-index='24']"));
        citySelect.click();

        WebElement dropDownBut = driver.findElement(By.xpath("//select[@id='daynight']/../.."));
        dropDownBut.click();
        WebElement employmentSelect = driver.findElement(By.xpath(
                "//label[@for='daynight']/following-sibling::div//li"));
        employmentSelect.click();

        WebElement canWork = driver.findElement(By.xpath(
                "//label[@for='select_time']/following-sibling::div//span"));
        canWork.click();
        WebElement timeWork = driver.findElement(By.xpath(
                "//label[@for='select_time']/following-sibling::div//li[2]"));
        timeWork.click();

        WebElement calculateButton = driver.findElement(By.xpath("//a[@id='js-calculator-form-btn']"));
        calculateButton.click();

        WebElement totalPriceElement = driver.findElement(By.xpath("(//h3[@class='js-total-price'])"));
        String totalPriceText = totalPriceElement.getText().replace(" грн.", "");
        double totalPrice = Double.parseDouble(totalPriceText);

        assertTrue(totalPrice > 0, "Total price is not greater than 0.");
    }

    @Test(description = "SPAC-34")
    public void questionsAndAnswersTest() {

        WebElement zapBtn = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__nav-links']//" +
                        "li[contains(@data-cmp-data-layer, 'zapitannja-ta-vidpovidi/')]"));
        zapBtn.click();

        assertTrue(driver.getCurrentUrl().contains("/zapitannja-ta-vidpovidi/"));

        WebElement employmentButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='1']"));
        employmentButton.click();

        assertTrue(employmentButton.getAttribute("class").contains("active"));

        WebElement generalQuestionsButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='2']"));
        generalQuestionsButton.click();

        assertTrue(generalQuestionsButton.getAttribute("class").contains("active"));

        WebElement jobFeaturesButton = driver.findElement(By.xpath(
                "//div[@class='faq_tab_choose-list']/div[@data-tab='3']"));
        jobFeaturesButton.click();

        assertTrue(jobFeaturesButton.getAttribute("class").contains("active"));
    }

    @Test(description = "SPAC-35")
    public void googlePlayButtonTest() throws InterruptedException {

        WebElement gPlayButton = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__apps']/div[2]"));
        gPlayButton.click();
        gPlayButton.click();
        switchToTab(driver, 1);

        assertTrue(driver.getCurrentUrl().contains("mcdonalds.mobileapp"));
    }

    @Test(description = "SPAC-36")
    public void appStoreButtonTest() throws InterruptedException {

        WebElement aStoreButton = driver.findElement(By.xpath(
                "//div[@class='cmp-footer__apps']/div[1]"));
        aStoreButton.click();
        switchToTab(driver, 1);

        assertTrue(driver.getCurrentUrl().contains("app/mcdonalds"));

        WebElement mcDtittle = driver.findElement(By.xpath(
                "//h1[@class='product-header__title app-header__title']"));

        assertTrue(mcDtittle.getText().toLowerCase().contains("McDonald's"));
    }
}
