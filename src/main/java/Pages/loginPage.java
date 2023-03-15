package Pages;

import Locators.loginLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    static WebElement element = null;

    public static WebElement userNameField(WebDriver driver){
        element = driver.findElement(By.id(loginLocators.userNameId));
        return element;
    }

    public static WebElement passwordField(WebDriver driver){
        element = driver.findElement(By.id(loginLocators.passwordId));
        return element;
    }

    public static WebElement loginButton(WebDriver driver){
        element = driver.findElement(By.id(loginLocators.loginButtonId));
        return element;
    }
}
