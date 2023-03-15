package Pages;

import Locators.checkoutLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {
    static WebElement element = null;

    public static WebElement firstNameField(WebDriver driver){
        element = driver.findElement(By.id(checkoutLocators.firstNameId));
        return element;
    }

    public static WebElement lastNameField(WebDriver driver){
        element = driver.findElement(By.id(checkoutLocators.lastNameId));
        return element;
    }

    public static WebElement zipCodeField(WebDriver driver){
        element = driver.findElement(By.id(checkoutLocators.zipCodeId));
        return element;
    }

    public static WebElement continueButton(WebDriver driver){
        element = driver.findElement(By.id(checkoutLocators.continueButtonId));
        return element;
    }

}
