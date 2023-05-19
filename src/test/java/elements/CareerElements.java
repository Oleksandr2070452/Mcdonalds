package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class CareerElements extends BasePage {
    public CareerElements(WebDriver driver) {
        super(driver);
    }
    public static final String CITY_DROPDOWN = "//label[@for='calc-city']/following-sibling::div//b";
    public static final String LUTSK_CITY = "//li[@data-index='24']";
    public static final String SCHEDULE_DROPDOWN = "//select[@id='daynight']/../..";
    public static final String SCHEDULE_DAY = "//label[@for='daynight']/following-sibling::div//li[@data-index='0']";
    public static final String CAN_WORK_DROPDOWN = "//label[@for='select_time']/following-sibling::div//span";
    public static final String WORK_ANY_TIME = "//label[@for='select_time']/following-sibling::div//span";
    public static final String COUNT_SALARY_BTN = "//a[@id='js-calculator-form-btn']";
    public static final String PREDICTED_SALARY = "(//h3[@class='js-total-price'])";
    public static final String LEARN_MORE_BTN = "(//a[@id='calculator-info-btn'])";
    public static final String WANT_WORK_BTN = "(//a[@id='calculator-info-btn']/following-sibling::a)";



}
