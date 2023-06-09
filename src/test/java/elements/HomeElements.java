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
    public static final String MORE_HAPPY_MEAL = "//*[@id=\"teaser-99db66b3be\"]/div[2]/div[2]/a";
    public static final String READ_BOOK_DETAIL = "//*[@id=\"teaser-99816fd854\"]/div[2]/div[2]/a";
    public static final String DELIVER_FAVORITE_DETAILS = "//*[@id=\"teaser-2a3a6fa706\"]/div[2]/div[2]/a";
    public static final String INFLUENCE_STRATEGY = "(//nav[@itemtype='http://schema.org/SiteNavigationElement']/ul/li)[10]";
    public static final String OPEN_RESTAURANT = "(//ul[@id='list-750fab3099']/li/a/span)[2]";
    public static final String WORK_PLACE_BTN = "//span[contains(text(),'Робочі місця')]";
    public static final String WORK_PLACE_TITTLE = "//div[@id='title-43c10e9974']";
    public static final String QUESTION_AND_ANSWER_BTN =
            "//div[@class='cmp-footer__nav-links']//li[contains(@data-cmp-data-layer, 'zapitannja-ta-vidpovidi/')]";
    public static final String EMPLOYMENT_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='1']";
    public static final String GENERAL_QUESTION_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='2']";
    public static final String JOB_FEATURES_BTN = "//div[@class='faq_tab_choose-list']/div[@data-tab='2']";
    public static final String APP_STORE_BTN = "//div[@class='cmp-footer__apps']/div[1]";
    public static final String INSTAGRAM_BTN = "//div[@data-title='Instagram']/a";
    public static final String GOOGLE_PLAY_BTN = "//div[@class='cmp-footer__apps']/div[2]";
    public static final String TWITTER_BTN = "//div[@data-title='Twitter']";
    public static final String WORK_IN_MCDONALDS_BTN = "//div[@id='teaser-d543114359']//a";
    public static final String ARROW_IN_SLIDER_MOVE_NEXT = "//button[@aria-label='Next']";
    public static final String LEARN_MORE_BTN = "//*[@id='teaser-4fd499e808']/div[2]/div[2]/a";
    public static final String FACEBOOK_BTN = "//img[@alt='Facebook']";
    public static final String TIK_TOK_BTN = "//img[@alt='Tiktok']";
}
