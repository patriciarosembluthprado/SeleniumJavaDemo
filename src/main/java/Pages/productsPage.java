package Pages;

import Locators.productsLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class productsPage {
    static WebElement element = null;
    static List<WebElement> listOfProducts = new ArrayList<WebElement>();

    public static List<WebElement> selectProducts(WebDriver driver){
        element = driver.findElement(By.id(productsLocators.backpackId));
        listOfProducts.add(element);
        element = driver.findElement(By.id(productsLocators.bikeLightId));
        listOfProducts.add(element);
        element = driver.findElement(By.id(productsLocators.boltTShirt));
        listOfProducts.add(element);
        return listOfProducts;
    }

    public static WebElement selectCart(WebDriver driver){
        element = driver.findElement(By.id(productsLocators.shoppingCartId));
        return element;
    }


}
