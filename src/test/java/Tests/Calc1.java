package Tests;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.MainPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class Calc1 extends BaseTest {

    @Test
    public void Calctest () {
        MainPage mainPage = new MainPage(driver);
        mainPage.goToWebCalc();

        driver.findElement(By.id("cookieconsentallowall")).click();

        driver.findElement(By.id("input")).sendKeys("35");
        driver.findElement(By.id("BtnMult")).click();
        driver.findElement(By.id("input")).sendKeys("999");

        driver.findElement(By.id("BtnPlus")).click();
        driver.findElement(By.id("BtnParanL")).click();
        driver.findElement(By.id("input")).sendKeys("100");
        driver.findElement(By.id("BtnDiv")).click();
        driver.findElement(By.id("input")).sendKeys("4");
        driver.findElement(By.id("BtnParanR")).click();
        driver.findElement(By.id("BtnCalc")).click();

        WebElement equal1 = wait.until(presenceOfElementLocated(By.id("result")));
        driver.findElement(By.cssSelector("span.glyphicon-chevron-down")).click();
        WebElement equal2 = wait.until(presenceOfElementLocated(By.id("clearhistory")));
        String results = driver.findElement(By.xpath("//*[@id=\"histframe\"]/ul/li/p[1]")).getText();
        Assert.assertTrue(results.contains("34990"));

    }
}
