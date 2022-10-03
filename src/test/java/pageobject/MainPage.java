package pageobject;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage {
    private WebDriver driver;
    private String pageURL = "https://qa-scooter.praktikum-services.ru/";
    private By firstOrderButton = By.xpath("//div[2]/button[text()=\"Заказать\"]");
    private By secondOrderButton = By.xpath("//div[5]/button[text()=\"Заказать\"]");
    // 7 тогглов с вопросами
    private By firstQuestion = By.id("accordion__heading-0");
    private By secondQuestion = By.id("accordion__heading-1");
    private By thirdQuestion = By.id("accordion__heading-2");
    private By fourthQuestion = By.id("accordion__heading-3");
    private By fifthQuestion = By.id("accordion__heading-4");
    private By sixthQuestion = By.id("accordion__heading-5");
    private By seventhQuestion = By.id("accordion__heading-6");
    private By eightsLastQuestion = By.id("accordion__heading-7");

    // 7 полей с ответами
    private String firstAnswer = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String secondAnswer = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String thirdAnswer = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String fourthAnswer = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String fifthAnswer = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String sixthAnswer = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String seventhAnswer = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String eightsLastAnswer = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public MainPage open() {
        driver.get(pageURL);
        return this;
    }

    public void clickFirstOrderButton() {
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(firstOrderButton)).click();
    }

    public void clickSecondOrderButton() {
        WebElement element = driver.findElement(secondOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(secondOrderButton)).click();
    }

    public void checkFirstQuestion() {
        WebElement element = driver.findElement(firstQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(firstQuestion)).click();
        assertEquals("Текст не тот", firstAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[1]/div[2]/p")).getText());
    }

    public void checkSecondQuestion() {
        WebElement element = driver.findElement(secondQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(secondQuestion)).click();
        assertEquals("Текст не тот", secondAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[2]/div[2]/p")).getText());
    }

    public void checkThirdQuestion() {
        WebElement element = driver.findElement(thirdQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(thirdQuestion)).click();
        assertEquals("Текст не тот", thirdAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[3]/div[2]/p")).getText());
    }

    public void checkFourthQuestion() {
        WebElement element = driver.findElement(fourthQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(fourthQuestion)).click();
        assertEquals("Текст не тот", fourthAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[4]/div[2]/p")).getText());
    }

    public void checkFifthQuestion() {
        WebElement element = driver.findElement(fifthQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(fifthQuestion)).click();
        assertEquals("Текст не тот", fifthAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[5]/div[2]/p")).getText());
    }

    public void checkSixthQuestion() {
        WebElement element = driver.findElement(sixthQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(sixthQuestion)).click();
        assertEquals("Текст не тот", sixthAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[6]/div[2]/p")).getText());
    }

    public void checkSeventhQuestion() {
        WebElement element = driver.findElement(seventhQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(seventhQuestion)).click();
        assertEquals("Текст не тот", seventhAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[7]/div[2]/p")).getText());
    }

    public void checkEightsLastQuestion() {
        WebElement element = driver.findElement(eightsLastQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        new WebDriverWait(driver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(eightsLastQuestion)).click();
        assertEquals("Текст не тот", eightsLastAnswer, driver.findElement(By.xpath("/html/body/div/div/div/div[5]/div[2]/div/div[8]/div[2]/p")).getText());

    }
}
