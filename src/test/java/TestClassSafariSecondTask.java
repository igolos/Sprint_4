import PageObject.MainPage;
import PageObject.OrderPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class TestClassSafariSecondTask {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void checkOrderWithFirstButton_OrderSuccess() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickFirstOrderButton();
        objOrderPage.clickCookie();
        objOrderPage.enterName("Анастасия");
        objOrderPage.enterSurname("Голос");
        objOrderPage.enterAddress("Москва");
        objOrderPage.enterStationForFirstTest();
        objOrderPage.enterPhone("+79995556644");
        objOrderPage.clickNextButton();
        objOrderPage.chooseDay();
        objOrderPage.chooseDurationOneDay();
        objOrderPage.chooseBlackColour();
        objOrderPage.addComment("Быстрее");
        objOrderPage.clickFinishButton();
        objOrderPage.chooseYesButton();
        objOrderPage.checkStatus();
    }

    @Test
    public void checkOrderWithSecondButton_OrderSuccess() {
        MainPage objMainPage = new MainPage(driver);
        OrderPage objOrderPage = new OrderPage(driver);
        objMainPage.open();
        objMainPage.clickSecondOrderButton();
        objOrderPage.clickCookie();
        //Ввести 2 пробела специально
        objOrderPage.enterName("  ");
        objOrderPage.enterSurname("Тест");
        // Не заполнять Адрес objOrderPage.enterAddress("Тестовый город");
        objOrderPage.enterStationForSecondTest();
        objOrderPage.enterPhone("89995556644");
        objOrderPage.clickNextButton();
        objOrderPage.chooseDay();
        objOrderPage.chooseDurationTwoDays();
        objOrderPage.chooseGreyColour();
        objOrderPage.addComment("Быстрее");
        objOrderPage.clickFinishButton();
        objOrderPage.chooseYesButton();
        objOrderPage.checkStatus();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
