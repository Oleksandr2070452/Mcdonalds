package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.TimeToCherryNoveltyPage;

public class TimeToCherryNoveltyTest extends TestInit {

    @Test
    public void checkVisibilityOfDesertsTest() {

        HomePage homePage = new HomePage(driver);
        homePage.clickMultiplyClickArrowMoveNext()
                .clickLearnMoreForCherrryNoveltyPage();

        assertTrue(driver.getCurrentUrl().contains("fresh-cherry"));

        TimeToCherryNoveltyPage timeToCherryNoveltyPage = new TimeToCherryNoveltyPage(driver);

        assertTrue(timeToCherryNoveltyPage.isDisplayedIceAmericano());
        assertTrue(timeToCherryNoveltyPage.isDisplayedIceLate());
        assertTrue(timeToCherryNoveltyPage.isDisplayedLemonadeCherry());
        assertTrue(timeToCherryNoveltyPage.isDisplayedMacFluriKitKatCherry());
        assertTrue(timeToCherryNoveltyPage.isDisplayedMacSandiCherry());
        assertTrue(timeToCherryNoveltyPage.isDisplayedMacSandiCherryChocolate());
        assertTrue(timeToCherryNoveltyPage.isDisplayedMacShakeCherry());
    }
}

