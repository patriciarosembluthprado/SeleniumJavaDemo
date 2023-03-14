import Helpers.createDriver;
import Pages.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginTest {

    @Test
    public static void LoginTest() {

        WebDriver driver = createDriver.newChromeDriver();
        String expectedTitle = "Products";
        driver.get("https://www.saucedemo.com/");
        loginPage.userNameField(driver).sendKeys("standard_user");
        loginPage.passwordField(driver).sendKeys("secret_sauce");
        loginPage.loginButton(driver).click();
        String actualTitle = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
        driver.quit();
    }
}
