import pageobject.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassChromeFirstTask {
    private WebDriver driver;

    @Before
    public void stetUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void checkFirstQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkFirstQuestion();
    }

    @Test
    public void checkSecondQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkSecondQuestion();
    }

    @Test
    public void checkThirdQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkThirdQuestion();
    }

    @Test
    public void checkFourthQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkFourthQuestion();
    }

    @Test
    public void checkFifthQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkFifthQuestion();
    }

    @Test
    public void checkSixthQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkSixthQuestion();
    }

    @Test
    public void checkSeventhQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkSeventhQuestion();
    }

    @Test
    public void checkEightsLastQuestion_correctAnswer() {
        MainPage objMainPage = new MainPage(driver);
        objMainPage.open();
        objMainPage.checkEightsLastQuestion();
    }

    @After
    public void teardown() {
        driver.quit();

    }
}
