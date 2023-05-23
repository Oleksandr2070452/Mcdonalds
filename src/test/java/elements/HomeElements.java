package elements;

import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomeElements extends BasePage {
    public HomeElements(WebDriver driver) {
        super(driver);
    }

    public static final String SEARCH_BTN = "//a[@class='cmp-list__item-link']/span[@class='item-text']";
    public static final String SALARY_CALCULATOR_BTN = "//span[contains(text(),'Зарплатний калькулятор')]";
    public static final String MENU_BTN = "//button[@aria-controls='ourMenuSubItemsList_desktop']";
    public static final String FULL_MENU_BTN = "//div[@id='ourMenuSubItemsList_desktop']" +
            "//div[@class='view-full-menu d-none d-lg-block']/a";
    public static final String FOUNDATION_RONALDA_BTN =
            "//div[@class='cmp-footer__nav-links']//a[contains(@data-cmp-data-layer,'Фундація')]";
    public static final String FOUNDATION_RONALDA_TITTLE =
            "//div[@id='title-5715acaaad']/h1";
    public static final String VISIT_SITE_BTN = "//a[@class='cmp-teaser__action-link ']";
    public static final String WORK_PLACE_BTN = "//span[contains(text(),'Робочі місця')]";
    public static final String WORK_PLACE_TITTLE = "//div[@id='title-43c10e9974']";
    public static final String QUESTION_AND_ANSWER_BTN =
            "//div[@class='cmp-footer__nav-links']//li[contains(@data-cmp-data-layer, 'zapitannja-ta-vidpovidi/')]";
    public static final String EMPLOYMENT_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='1']";
    public static final String GENERAL_QUESTION_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='2']";
    public static final String JOB_FEATURES_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='2']";
    public static final String APP_STORE_BTN = "//div[@class='cmp-footer__apps']/div[1]";
    public static final String INSTAGRAM_BTN = "//div[@data-title='Instagram']/a";


}
