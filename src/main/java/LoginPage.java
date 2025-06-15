package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;
    private final String linkLoginPage = "https://stellarburgers.nomoreparties.site/login";
    private final By signInButton = By.xpath(".//button[text()='Войти']");
    private final By emailInput = By.name("name");
    private final By passwordInput = By.name("Пароль");
    private final By registrationButton = By.xpath(".//*[@href='/register']");
    private final By restorePassword = By.xpath(".//*[@href='/forgot-password']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {

        driver.get(linkLoginPage);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void clickRegistrationButton() {
        driver.findElement(registrationButton).click();
    }

    public void clickRestorePassword() {
        driver.findElement(restorePassword).click();
    }

    public void setEmail(String email) {
        driver.findElement(emailInput).sendKeys(email);
    }

    public void setPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void fillingEmailPassword(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getTextSignInButton() {

        return driver.findElement(signInButton).getText();
    }

}
