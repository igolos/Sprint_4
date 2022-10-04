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

    private By nameInput = By.xpath("//div/input[@placeholder=\"* Имя\"]");
    private By surnameInput = By.xpath("//div/input[@placeholder=\"* Фамилия\"]");
    private By addressInput = By.xpath("//div/input[@placeholder=\"* Адрес: куда привезти заказ\"]");
    private By stationInput = By.xpath("//div/input[@placeholder=\"* Станция метро\"]");
    private By phoneInput = By.xpath("//div/input[@placeholder=\"* Телефон: на него позвонит курьер\"]");
    private By nextButton = By.xpath("//div[@class='Order_NextButton__1_rCA']/button");
    private By cookieButton = By.xpath("//*[@id=\"rcc-confirm-button\"]");
    private By dataPicker = By.xpath("//div/input[@placeholder=\"* Когда привезти самокат\"]");
    private By duration = By.xpath("//div[@class=\"Dropdown-placeholder\"]");
    private By blackColour = By.xpath("//div/label[@for=\"black\"]");
    private By greyColour = By.xpath("//div/label[@for=\"grey\"]");
    private By commentInput = By.xpath("//div/input[@placeholder='Комментарий для курьера']");
    private By finishButton = By.xpath("//div[@class='Order_Buttons__1xGrp']/button[2]");
    private By yesButton = By.xpath("//div[@class='Order_Modal__YZ-d3']/div/button[2]");
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
        driver.findElement(By.xpath("//ul/li/button[@value='1']")).click();
    }

    public void enterStationAvtozavodskaya() {
        driver.findElement(stationInput).click();
        driver.findElement(By.xpath("//ul/li/button[@value='35']")).click();
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
        driver.findElement(By.xpath("//div[@aria-label=\"Choose понедельник, 24-е октября 2022 г.\"]")).click();
    }

    public void chooseDurationTwoDays() {
        driver.findElement(duration).click();
        driver.findElement(By.xpath("//div[@class='Dropdown-menu']/div[2]")).click();
    }

    public void chooseDurationOneDay() {
        driver.findElement(duration).click();
        driver.findElement(By.xpath("//div[@class='Dropdown-menu']/div[1]")).click();
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
        MatcherAssert.assertThat(driver.findElement(By.xpath("//div/div[@class='Order_ModalHeader__3FDaJ']")).getText(), startsWith(successText));
    }
}
