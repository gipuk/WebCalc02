package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;
import org.junit.Assert;

public class CalcPage extends BasePage {
    public CalcPage(WebDriver driver){
        super(driver);
    }

    By acceptAllCookiesBtnBy = By.id("cookieconsentallowall");
    By multiplyBtnBy = By.id("BtnMult");
    By plusBtnBy = By.id("BtnPlus");
    By parenthasisLBtnBy = By.id("BtnParanL");
    By parenthasisRBtnBy = By.id("BtnParanR");
    By divideBtnBy = By.id("BtnDiv");
    By equalBtnBy = By.id("BtnCalc");
    By inputFieldBy = By.id("input");
    By resultField = By.id("result");
    By historyDropdownBy = By.cssSelector("span.glyphicon-chevron-down");
    By historyResultFirstBy = By.xpath("//*[@id=\"histframe\"]/ul/li/p[1]");
}
