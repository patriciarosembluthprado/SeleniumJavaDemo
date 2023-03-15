package Pages;

import Locators.loginLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {

    public static WebDriver enterUserName(WebDriver driver){
        driver.findElement(By.id(loginLocators.userNameId)).sendKeys("standard_user");
        return driver;
    }
    public static WebDriver enterPassword(WebDriver driver){
        driver.findElement(By.id(loginLocators.passwordId)).sendKeys("secret_sauce");
        return driver;
    }

    public static WebDriver clickLogin(WebDriver driver){
        driver.findElement(By.id(loginLocators.loginButtonId)).click();
        return driver;
    }
}
