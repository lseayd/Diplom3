package RecoveryPasswordPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RecoveryPasswordPage {

    private final WebDriver driver;
    private final String linkRecoveryPasswordPage = "https://stellarburgers.nomoreparties.site/forgot-password";
    private final By recoveryPasswordButton = By.xpath(".//button[text()='Восстановить']");
    private final By signInButton = By.linkText("Войти");

    public RecoveryPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openRecoveryPasswordPage() {

        driver.get(linkRecoveryPasswordPage);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public void waitRegistrationButton() {
        new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(recoveryPasswordButton));
    }


}
