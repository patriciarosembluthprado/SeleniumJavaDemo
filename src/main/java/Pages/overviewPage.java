package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class overviewPage {

    static WebElement element = null;

    public static WebElement finishButton(WebDriver driver){
        element = driver.findElement(By.id("finish"));
        return element;
    }
}
