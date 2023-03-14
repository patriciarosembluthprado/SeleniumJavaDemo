package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class productsPage {
    static WebElement element = null;
    static List<WebElement> listOfProducts = new ArrayList<WebElement>();

    public static List<WebElement> selectProducts(WebDriver driver){
        element = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        listOfProducts.add(element);
        element = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
        listOfProducts.add(element);
        element = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        listOfProducts.add(element);
        return listOfProducts;
    }

    public static WebElement selectCart(WebDriver driver){
        element = driver.findElement(By.id("shopping_cart_container"));
        return element;
    }


}
