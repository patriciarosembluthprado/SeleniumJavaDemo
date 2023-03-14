package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cartPage {

    static WebElement element = null;

    public static WebElement checkoutButton(WebDriver driver){
        element = driver.findElement(By.id("checkout"));
        return element;
    }

}
