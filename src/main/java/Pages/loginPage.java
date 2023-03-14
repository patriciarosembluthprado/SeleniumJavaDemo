package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
    static WebElement element = null;

    public static WebElement userNameField(WebDriver driver){
        element = driver.findElement(By.id("user-name"));
        return element;
    }

    public static WebElement passwordField(WebDriver driver){
        element = driver.findElement(By.id("password"));
        return element;
    }

    public static WebElement loginButton(WebDriver driver){
        element = driver.findElement(By.id("login-button"));
        return element;
    }
}
