package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final String linkHomePage = "https://stellarburgers.nomoreparties.site/";
    private final By buttonAccount = By.linkText("Личный Кабинет");
    private final By signInButton = By.xpath(".//button[text()='Войти в аккаунт']");
    private final By constructorButton = By.linkText("Конструктор");
    private final By logo = By.className("AppHeader_header__logo__2D0X2");
    private final By headerConstructor = By.xpath(".//*[@class='text text_type_main-large mb-5 mt-10']");
    private final By bunsTab = By.xpath(".//div/span[text()='Булки']");
    private final By bunsIsDisplayed = By.xpath(".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span");
    private final By saucesTab = By.xpath(".//div/span[text()='Соусы']");
    private final By saucesIsDisplayed = By.xpath(".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span");

    private final By fillingsTab = By.xpath(".//div/span[text()='Начинки']");
    private final By fillingsIsDisplayed = By.xpath(".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span");
    private final By activeTab = By.xpath(".//div[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']/span");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void openHomePage() {

        driver.get(linkHomePage);
    }

    public void clickButtonAccount() {

        driver.findElement(buttonAccount).click();
    }

    public void clickSignInButton() {

        driver.findElement(signInButton).click();
    }

    public void clickConstructorButton() {

        driver.findElement(constructorButton).click();
    }

    public void clickLogo() {

        driver.findElement(logo).click();
    }

    public void clickBuns() {

        driver.findElement(bunsTab).click();
    }

    public boolean bunsTabIsActive() {
        return driver.findElement(bunsIsDisplayed).isDisplayed();
    }

    public void clickSauces() {

        driver.findElement(saucesTab).click();
    }

    public boolean saucesTabIsActive() {
        return driver.findElement(saucesIsDisplayed).isDisplayed();
    }

    public void clickFillings() {

        driver.findElement(fillingsTab).click();
    }

    public boolean fillingsTabIsActive() {
        return driver.findElement(fillingsIsDisplayed).isDisplayed();
    }


    public String getTextHeaderConstructor() {

        return driver.findElement(headerConstructor).getText();
    }

}
