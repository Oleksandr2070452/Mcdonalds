package tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import pages.HomePage;
import static utills.CommonAction.scrollDownLess;

public class CheckInfluenceStrategyTest extends TestInit{

    @Test
    public void checkLogoButton() {

        HomePage homePage = new HomePage(driver);

        homePage.clickInfluenceStrategy();
        scrollDownLess(driver);

        assertTrue(driver.findElement(By.xpath("//div[@class='columnlayout responsivegrid pt-responsive aem-GridColumn aem-GridColumn--default--3']")).isDisplayed());
    }
}
