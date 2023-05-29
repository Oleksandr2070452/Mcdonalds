package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestOpeningPageSaveThePlanet extends TestInit {
    @Test(description = "SPAC-29")
    public void checkOpeningPageSaveThePlanet() throws InterruptedException {
        driver.findElement(By.xpath("(//a[contains(text(),'Стратегія впливу')])[2]")).click();
        driver.findElement(By.xpath("//a[@class='cmp-teaser__action-link ' and @href='/ua/uk-ua/impact_strategy/save_the_planet.html']")).click();

        assertTrue(driver.getCurrentUrl().contains("https://www.mcdonalds.com/ua/uk-ua/impact_strategy/save_the_planet.html"));
    }
}
