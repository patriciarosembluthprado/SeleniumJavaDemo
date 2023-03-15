import Configuration.propertiesFile;
import Helpers.createDriver;
import Locators.checkoutCompleteLocators;
import Pages.*;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
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
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify the user can purchase an order")
    public static void purchaseOrderTest(){

        propertiesFile.getEnvProperties(); //Set URL from env file
        WebDriver driver = createDriver.newChromeDriver(); //create chrome driver

        String expectedCompleteText = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
        loginPage.enterUserName(driver);
        loginPage.enterPassword(driver);
        loginPage.clickLogin(driver);
        productsPage.addProductsToCart(driver);
        productsPage.selectShoppingCartIcon(driver);
        shoppingCartPage.clickCheckoutButton(driver);
        checkoutPage.enterFirstName(driver);
        checkoutPage.enterLastName(driver);
        checkoutPage.enterZipCode(driver);
        checkoutPage.clickContinueButton(driver);
        overviewPage.clickFinishButton(driver);

        String actualCompleteText = checkoutCompletePage.getCompletedPurchaseText(driver);
        Assert.assertEquals(expectedCompleteText, actualCompleteText);
        driver.close();
        driver.quit();

    }
}
