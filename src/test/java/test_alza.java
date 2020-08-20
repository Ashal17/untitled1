import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_alza {

    @BeforeMethod

    @AfterMethod

    @Test
    public void simpleSearchTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alza.cz");

        driver.findElement(By.id("litp18861668")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"/flashdisk-prenosne-usb-disky/18842861.htm\"]")));

        driver.findElement(By.cssSelector("[href=\"/flashdisk-prenosne-usb-disky/18842861.htm\"]")).click();
        driver.close();
    }

}
