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

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*"); //to pass security issues
        WebDriver driver = new ChromeDriver(options);
        String expectedTitle = "Products";

        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String actualTitle = driver.findElement(By.xpath("//span[@class='title']")).getText();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close();
        driver.quit();
    }
}
