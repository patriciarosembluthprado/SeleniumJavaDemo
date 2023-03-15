package Pages;

import Locators.overviewLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class overviewPage {

    public static WebDriver clickFinishButton(WebDriver driver){
        driver.findElement(By.id(overviewLocators.finishButtonId)).click();
        return driver;
    }
}
