package PageObject;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.startsWith;

public class OrderPage {
    public WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private static final By NAME_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private static final By SURNAME_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private static final By ADDRESS_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private static final By STATION_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    private static final By PHONE_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    private static final By NEXT_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    private static final By COOKIE_BUTTON = By.xpath("//*[@id=\"rcc-confirm-button\"]");
    private static final By DATA_PICKER = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");
    private static final By DURATION = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    private static final By BLACK_COLOUR = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[1]");
    private static final By GREY_COLOUR = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[2]");
    private static final By COMMENT_INPUT = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");
    private static final By FINISH_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    private static final By YES_BUTTON = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    private static final String SUCCESS_TEXT = "Заказ оформлен";

    public void enterName(String name) {
        driver.findElement(NAME_INPUT).sendKeys(name);
    }

    public void enterSurname(String surname) {
        driver.findElement(SURNAME_INPUT).sendKeys(surname);
    }

    public void enterAddress(String address) {
        driver.findElement(ADDRESS_INPUT).sendKeys(address);
    }

    public void enterStationForFirstTest() {
        driver.findElement(STATION_INPUT).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button")).click();
    }

    public void enterStationForSecondTest() {
        driver.findElement(STATION_INPUT).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[35]/button")).click();
    }

    public void enterPhone(String phone) {
        driver.findElement(PHONE_INPUT).sendKeys(phone);
    }

    public void clickNextButton() {
        driver.findElement(NEXT_BUTTON).click();
    }

    public void clickCookie() {
        driver.findElement(COOKIE_BUTTON).click();
    }

    public void chooseDay() {
        driver.findElement(DATA_PICKER).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]")).click();
    }

    public void chooseDurationTwoDays() {
        driver.findElement(DURATION).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }

    public void chooseDurationOneDay() {
        driver.findElement(DURATION).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
    }

    public void chooseBlackColour() {
        driver.findElement(BLACK_COLOUR).click();
    }

    public void chooseGreyColour() {
        driver.findElement(GREY_COLOUR).click();
    }

    public void addComment(String comment) {
        driver.findElement(COMMENT_INPUT).sendKeys(comment);
    }

    public void clickFinishButton() {
        driver.findElement(FINISH_BUTTON).click();
    }

    public void chooseYesButton() {
        driver.findElement(YES_BUTTON).click();
    }

    public void checkStatus() {
        MatcherAssert.assertThat(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText(), startsWith(SUCCESS_TEXT));
    }
}
