package Pages;

import Locators.checkoutCompleteLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkoutCompletePage {

    public static String getCompletedPurchaseText(WebDriver driver){
        String text = driver.findElement(By.xpath(checkoutCompleteLocators.completeTextXPath)).getText();
        return text;
    }
}
