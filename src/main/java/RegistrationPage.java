package RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private final WebDriver driver;
    private final String linkRegistrationPage = "https://stellarburgers.nomoreparties.site/register";
    private final By nameInput = By.xpath(".//fieldset[1]//input");
    private final By emailInput = By.xpath(".//fieldset[2]//input");
    private final By passwordInput = By.xpath(".//fieldset[3]//input");
    private final By registrationButton = By.xpath(".//*[@class='button_button__33qZ0 button_button_type_primary__1O7Bx button_button_size_medium__3zxIa']");
    private final By passwordIncorrect = By.xpath(".//p[text()='Некорректный пароль']");
    private final By signInButton = By.className("Auth_link__1fOlj");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRegistrationPage() {

        driver.get(linkRegistrationPage);
    }

    public void setName(String name) {
        driver.findElement(nameInput).sendKeys(name);
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void fillingNameEmailPassword(String name, String email, String password) {
        setName(name);
        setEmail(email);
        setPassword(password);
    }

    public void clickRegistrationButton() {

        driver.findElement(registrationButton).click();
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public String getTextPasswordIncorrect() {

        return driver.findElement(passwordIncorrect).getText();
    }
}
