package Pages;

import Locators.shoppingCartLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class shoppingCartPage {

    static WebElement element = null;

    public static WebElement checkoutButton(WebDriver driver){
        element = driver.findElement(By.id(shoppingCartLocators.checkoutButtonId));
        return element;
    }

}
