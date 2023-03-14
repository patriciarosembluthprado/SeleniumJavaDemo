package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutPage {
    static WebElement element = null;

    public static WebElement firstNameField(WebDriver driver){
        element = driver.findElement(By.id("first-name"));
        return element;
    }

    public static WebElement lastNameField(WebDriver driver){
        element = driver.findElement(By.id("last-name"));
        return element;
    }

    public static WebElement zipCodeField(WebDriver driver){
        element = driver.findElement(By.id("postal-code"));
        return element;
    }

    public static WebElement continueButton(WebDriver driver){
        element = driver.findElement(By.id("continue"));
        return element;
    }

}
