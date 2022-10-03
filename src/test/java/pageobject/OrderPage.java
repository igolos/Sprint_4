package pageobject;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.CoreMatchers.startsWith;

public class OrderPage {
    private WebDriver driver;

    public OrderPage(WebDriver driver) {
        this.driver = driver;
    }

    private By nameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/input");
    private By surnameInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/input");
    private By addressInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/input");
    private By stationInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div/input");
    private By phoneInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[5]/input");
    private By nextButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button");
    private By cookieButton = By.xpath("//*[@id=\"rcc-confirm-button\"]");
    private By dataPicker = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/input");
    private By duration = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div[1]");
    private By blackColour = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[1]");
    private By greyColour = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/label[2]");
    private By commentInput = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/input");
    private By finishButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[3]/button[2]");
    private By yesButton = By.xpath("//*[@id=\"root\"]/div/div[2]/div[5]/div[2]/button[2]");
    private String successText = "Заказ оформлен";

    public void enterName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void enterSurname(String surname) {
        driver.findElement(surnameInput).sendKeys(surname);
    }

    public void enterAddress(String address) {
        driver.findElement(addressInput).sendKeys(address);
    }

    public void enterStationRokossovskogo() {
        driver.findElement(stationInput).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[1]/button")).click();
    }

    public void enterStationAvtozavodskaya() {
        driver.findElement(stationInput).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[4]/div/div[2]/ul/li[35]/button")).click();
    }

    public void enterPhone(String phone) {
        driver.findElement(phoneInput).sendKeys(phone);
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
    }

    public void clickCookie() {
        driver.findElement(cookieButton).click();
    }

    public void chooseDayFromThisMonth() {
        driver.findElement(dataPicker).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[1]")).click();
    }

    public void chooseDurationTwoDays() {
        driver.findElement(duration).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[2]")).click();
    }

    public void chooseDurationOneDay() {
        driver.findElement(duration).click();
        driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div[1]")).click();
    }

    public void chooseBlackColour() {
        driver.findElement(blackColour).click();
    }

    public void chooseGreyColour() {
        driver.findElement(greyColour).click();
    }

    public void addComment(String comment) {
        driver.findElement(commentInput).sendKeys(comment);
    }

    public void clickFinishButton() {
        driver.findElement(finishButton).click();
    }

    public void chooseYesButton() {
        driver.findElement(yesButton).click();
    }

    public void checkStatus() {
        MatcherAssert.assertThat(driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]")).getText(), startsWith(successText));
    }
}
