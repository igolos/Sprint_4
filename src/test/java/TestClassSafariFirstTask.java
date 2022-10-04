import pageobject.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestClassSafariFirstTask {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
    }

    @Test
    public void checkFirstQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkFirstQuestion();
    }

    @Test
    public void checkSecondQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkSecondQuestion();
    }

    @Test
    public void checkThirdQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkThirdQuestion();
    }

    @Test
    public void checkFourthQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkFourthQuestion();
    }

    @Test
    public void checkFifthQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkFifthQuestion();
    }

    @Test
    public void checkSixthQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkSixthQuestion();
    }

    @Test
    public void checkSeventhQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkSeventhQuestion();
    }

    @Test
    public void checkEightsLastQuestion_correctAnswer() {
        MainPage objMainPage2 = new MainPage(driver);
        objMainPage2.open();
        objMainPage2.checkEightsLastQuestion();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}

