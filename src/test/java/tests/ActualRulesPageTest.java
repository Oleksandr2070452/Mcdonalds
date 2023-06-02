package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

public class ActualRulesPageTest extends TestInit {

    @Test(description = "SPAC-21")
    public void checkActualRulesPage() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(),'Мобільний додаток')])[2]")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Актуальні правила акції')]")).click();

        sleep(2000);
        switchToTab(driver, 1);

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.mcdonalds.com/content/dam/sites/ua/nfl/pdf/GMA/Rules-Addendum_12.04-31.05.2023.pdf");
    }
}
