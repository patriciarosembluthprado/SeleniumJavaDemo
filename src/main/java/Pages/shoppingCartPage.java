package Pages;

import Locators.shoppingCartLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class shoppingCartPage {

    public static WebDriver clickCheckoutButton(WebDriver driver){
        driver.findElement(By.id(shoppingCartLocators.checkoutButtonId)).click();
        return driver;
    }

}
