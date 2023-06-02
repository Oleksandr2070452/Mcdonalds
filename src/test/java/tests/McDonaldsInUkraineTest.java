package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.McDonaldsInUkrainePage;

public class McDonaldsInUkraineTest extends TestInit {
    @Test
    public void checkRedirectionTest() {

        HomePage homePage = new HomePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        assertTrue(driver.getCurrentUrl().contains("to_know/mcdonalds_in_ukraine"));
    }

    @Test
    public void checkFinanceReport2019Test() {

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickFirstFinanceReport2019();

        assertTrue(driver.getCurrentUrl().contains("reporting/1.1"));
    }

    @Test
    public void checkManagementReport2019Test() {

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickManagementReport2019();

        assertTrue(driver.getCurrentUrl().contains("reporting/2.1"));
    }
    @Test
    public void checkConsolidatedFinanceReport2019Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickConsolidatedFinanceReport2019();

        assertTrue(driver.getCurrentUrl().contains("reporting/3.1"));
    }
    @Test
    public void checkConsolidatedManagementReport2019Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickConsolidatedManagementReport2019();

        assertTrue(driver.getCurrentUrl().contains("reporting/4.1"));
    }
    @Test
    public void checkFinanceReport2020Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickFirstFinanceReport2020();

        assertTrue(driver.getCurrentUrl().contains("/reporting/5.1"));
    }
    @Test
    public void checkManagementReport2020(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickManagementReport2020();

        assertTrue(driver.getCurrentUrl().contains("reporting/6.1"));
    }
    @Test
    public void checkConsolidatedFinanceReport2020Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickConsolidatedFinanceReport2020();

        assertTrue(driver.getCurrentUrl().contains("reporting/7.1"));
    }
    @Test
    public void checkConsolidatedManagementReport2020Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickConsolidatedManagementReport2020();

        assertTrue(driver.getCurrentUrl().contains("reporting/8.1"));
    }
    @Test
    public void checkFinanceReport2021Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickFinanceReport2021();

        assertTrue(driver.getCurrentUrl().contains("reporting/2021-1"));
    }
    @Test
    public void checkConsolidatedFinanceReport2021Test(){

        HomePage homePage = new HomePage(driver);
        McDonaldsInUkrainePage mcDonaldsInUkrainePage = new McDonaldsInUkrainePage(driver);

        homePage.clickMcDonaldInUkraineBtn();

        mcDonaldsInUkrainePage
                .clickConsolidatedFinanceReport2021();

        assertTrue(driver.getCurrentUrl().contains("reporting/2021-3"));
    }
}
