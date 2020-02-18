import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class Calc1 {

    @Test
    public void startWebDriver() {

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 20);

        driver.get("https://web2.0calc.com");
        String webTitle = driver.getTitle();
        System.out.print(webTitle);

        boolean verify = driver.getTitle().contains("Web 2.0 scientific calculator");
        if (verify) {
            System.out.println(" - It is OK!");
        } else {
            System.out.println(" - ERROR - Ups, wrong page!");
            driver.quit();
        }

        driver.manage().window().maximize();

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


        driver.manage().deleteAllCookies();
        driver.close();


    }
}
