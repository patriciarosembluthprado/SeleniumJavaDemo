package Pages;

import Locators.checkoutLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutPage {

    public static WebDriver enterFirstName(WebDriver driver){
        driver.findElement(By.id(checkoutLocators.firstNameId)).sendKeys("Test");
        return driver;
    }

    public static WebDriver enterLastName(WebDriver driver){
        driver.findElement(By.id(checkoutLocators.lastNameId)).sendKeys("Test");
        return driver;
    }

    public static WebDriver enterZipCode(WebDriver driver){
        driver.findElement(By.id(checkoutLocators.zipCodeId)).sendKeys("1234");
        return driver;
    }

    public static WebDriver clickContinueButton(WebDriver driver){
        driver.findElement(By.id(checkoutLocators.continueButtonId)).click();
        return driver;
    }

}
