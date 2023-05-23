package tests;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ActualRulesPageTest extends TestInit {
    @Test(description = "SPAC-21")
    public void checkActualRulesPage() throws InterruptedException {
    driver.findElement(By.xpath("(//a[contains(text(),'Мобільний додаток')])[2]")).click();
    driver.findElement(By.xpath("//a[contains(text(),'Актуальні правила акції')]")).click();

    }
}
