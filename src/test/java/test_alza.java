import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;

public class test_alza {

    @Test
    public void simpleSearchTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.alza.cz");

        driver.findElement(By.id("litp18861668")).click();
        WebDriverWait wait = new WebDriverWait(driver, 3);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[href=\"/flashdisk-prenosne-usb-disky/18842861.htm\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[href=\"/flashdisk-prenosne-usb-disky/18842861.htm\"]")));
        driver.findElement(By.cssSelector("[href=\"/flashdisk-prenosne-usb-disky/18842861.htm\"]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-controls=\"cenadesc\"]")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[aria-controls=\"cenadesc\"]")));
        driver.findElement(By.cssSelector("[aria-controls=\"cenadesc\"]")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[aria-controls=\"cenadesc\"][aria-selected=\"true\"]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".circle-loader-container[style=\"display: none;\"]")));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(1) .btnk1")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(1) .btnk1")));
        driver.findElement(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(1) .btnk1")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("varABackButton")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("varABackButton")));
        driver.findElement(By.id("varABackButton")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(2) .btnk1")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(2) .btnk1")));
        driver.findElement(By.cssSelector(".browsingitemcontainer .browsingitem:nth-child(2) .btnk1")).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("varAToBasketButton")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("varAToBasketButton")));
        driver.findElement(By.id("varAToBasketButton")).click();
        driver.close();
    }

}
