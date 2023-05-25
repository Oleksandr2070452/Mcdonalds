package tests;

import org.testng.annotations.Test;
import pages.HomePage;
import pages.McDelivery;

public class ListOfCitiesInMcDeliveryTest extends TestInit{
    private String resultURLCity = "https://ukraine.mcdonalds.ua/ukr/mcdelivery/";
    private String CityBilaCerkva = "Біла Церква";
    private String CityBoruspil = "Бориспіль";
    private String CityBrovary = "Бровари";
    private String CityBucha = "Буча";
    private String CityVinutsya = "Вінниця";
    private String CityDnipro = "Дніпро";
    private String CityZhytomyr = "Житомир";

    @Test
    public void checkCities() {

        HomePage homePage = new HomePage(driver);
        McDelivery mcDelivery = new McDelivery(driver);

        homePage.clickMcDelivery();
        mcDelivery.clickCityButton();

        String city = mcDelivery.getLocationCityText();
        assertEquals(driver.getCurrentUrl(), resultURLCity);
        assertTrue(city.contains(CityBilaCerkva));
        assertTrue(city.contains(CityBoruspil));
        assertTrue(city.contains(CityBrovary));
        assertTrue(city.contains(CityBucha));
        assertTrue(city.contains(CityVinutsya));
        assertTrue(city.contains(CityDnipro));
    }
}
