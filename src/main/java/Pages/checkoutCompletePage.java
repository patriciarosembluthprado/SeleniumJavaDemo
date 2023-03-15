package Pages;

import Locators.checkoutCompleteLocators;
import Locators.checkoutLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class checkoutCompletePage {

    static WebElement element = null;

    public static WebElement completeTextField(WebDriver driver){
        element = driver.findElement(By.xpath(checkoutCompleteLocators.completeTextXPath));
        return element;
    }
}
