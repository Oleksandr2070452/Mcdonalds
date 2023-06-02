package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class McDonaldsInUkrainePage extends BasePage {
    public McDonaldsInUkrainePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getFirstFinanceReport2019() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/1.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickFirstFinanceReport2019() {
        getFirstFinanceReport2019().click();
        moveToNextPage();
        return this;
    }

    public WebElement getManagementReport2019() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/2.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickManagementReport2019() {
        getManagementReport2019().click();
        moveToNextPage();
        return this;
    }

    public WebElement getConsolidatedFinanceReport2019() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/3.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickConsolidatedFinanceReport2019() {
        getConsolidatedFinanceReport2019().click();
        moveToNextPage();
        return this;
    }

    public WebElement getConsolidatedManagementReport2019() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/4.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickConsolidatedManagementReport2019() {
        getConsolidatedManagementReport2019().click();
        moveToNextPage();
        return this;
    }

    public WebElement getFirstFinanceReport2020() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/5.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickFirstFinanceReport2020() {
        getFirstFinanceReport2020().click();
        moveToNextPage();
        return this;
    }

    public WebElement getManagementReport2020() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/6.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickManagementReport2020() {
        getManagementReport2020().click();
        moveToNextPage();
        return this;
    }

    public WebElement getConsolidatedFinanceReport2020() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/7.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickConsolidatedFinanceReport2020() {
        getConsolidatedFinanceReport2020().click();
        moveToNextPage();
        return this;
    }

    public WebElement getConsolidatedManagementReport2020() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/8.1.pdf']"));
    }

    public McDonaldsInUkrainePage clickConsolidatedManagementReport2020() {
        getConsolidatedManagementReport2020().click();
        moveToNextPage();
        return this;
    }

    public WebElement getFinanceReport2021() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/2021-1.pdf']"));
    }

    public McDonaldsInUkrainePage clickFinanceReport2021() {
        getFinanceReport2021().click();
        return this;
    }

    public WebElement getConsolidatedFinanceReport2021() {
        return driver.findElement(By.xpath("//a[@href='/content/dam/sites/ua/nfl/pdf/reporting/2021-3.pdf']"));
    }

    public McDonaldsInUkrainePage clickConsolidatedFinanceReport2021() {
        getConsolidatedFinanceReport2021().click();
        return this;
    }
}
