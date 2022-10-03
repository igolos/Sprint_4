import pageobject.MainPage;
import pageobject.OrderPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class
TestClassChromeSecondTask {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkOrderWithFirstButton_YesButtonNoRequest() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickFirstOrderButton();
        objOrderPage.clickCookie();
        objOrderPage.enterName("Илья");
        objOrderPage.enterSurname("Голос");
        objOrderPage.enterAddress("Ростов-на-Дону");
        objOrderPage.enterStationRokossovskogo();
        objOrderPage.enterPhone("89895558844");
        objOrderPage.clickNextButton();
        objOrderPage.chooseDayFromThisMonth();
        objOrderPage.chooseDurationTwoDays();
        objOrderPage.chooseBlackColour();
        objOrderPage.addComment("Быстрее -хочу есть.*");
        objOrderPage.clickFinishButton();
        objOrderPage.chooseYesButton();
        //Запланированно падает на этом моменте
        objOrderPage.checkStatus();


    }

    @Test
    public void checkOrderWithSecondButton_YesButtonNoRequest() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickSecondOrderButton();
        objOrderPage.clickCookie();
        //Ввести 2 пробела специально
        objOrderPage.enterName("  ");
        objOrderPage.enterSurname("Тест");
        // Не заполнять Адрес objOrderPage.enterAddress("Тестовый город");
        objOrderPage.enterStationAvtozavodskaya();
        objOrderPage.enterPhone("89995556644");
        objOrderPage.clickNextButton();
        objOrderPage.chooseDayFromThisMonth();
        objOrderPage.chooseDurationTwoDays();
        objOrderPage.chooseGreyColour();
        objOrderPage.addComment("Быстрее");
        objOrderPage.clickFinishButton();
        objOrderPage.chooseYesButton();
        //Запланированно падает на этом моменте
        objOrderPage.checkStatus();
    }

    @After
    public void teardown() {
        driver.quit();

    }
}