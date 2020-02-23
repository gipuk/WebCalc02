package Tests;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.CalcPage;
import pageobjects.MainPage;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;


public class Calc1 extends BaseTest {

    @Test
    public void Calctest () {
        MainPage mainPage = new MainPage(driver);
        CalcPage calcPage = new CalcPage(driver);
        mainPage.goToWebCalc();

        mainPage.acceptCookies();

        calcPage.multiplyNumbers("35","999");
        calcPage.plusClick();
        calcPage.addbracketLeft();
        calcPage.divideNumbers("100", "4");
        calcPage.clickEqualBtn();
        calcPage.getResult("34990");


    }
}
