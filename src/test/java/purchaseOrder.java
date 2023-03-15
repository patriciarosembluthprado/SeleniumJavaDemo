import Helpers.createDriver;
import Locators.checkoutCompleteLocators;
import Pages.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class purchaseOrder {

    static List<WebElement> listOfProducts = new ArrayList<WebElement>();

    @Test
    public static void purchaseOrderTest(){
        WebDriver driver = createDriver.newChromeDriver();

        driver.get("https://www.saucedemo.com/");
        String expectedCompleteText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        loginPage.userNameField(driver).sendKeys("standard_user");
        loginPage.passwordField(driver).sendKeys("secret_sauce");
        loginPage.loginButton(driver).click();
        listOfProducts = productsPage.selectProducts(driver);
        for (int i = 0; i < listOfProducts.size(); i++){
            listOfProducts.get(i).click();
        }
        productsPage.selectCart(driver).click();
        shoppingCartPage.checkoutButton(driver).click();
        checkoutPage.firstNameField(driver).sendKeys("Test");
        checkoutPage.lastNameField(driver).sendKeys("Test");
        checkoutPage.zipCodeField(driver).sendKeys("1234");
        checkoutPage.continueButton(driver).click();
        overviewPage.finishButton(driver).click();
        String actualCompleteText = checkoutCompletePage.completeTextField(driver).getText();
        Assert.assertEquals(expectedCompleteText, actualCompleteText);

    }
}
