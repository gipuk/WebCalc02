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

    public CalcPage multiplyNumbers (String firstNumber, String secondNumber) {
        writeText(inputFieldBy, firstNumber);
        click(multiplyBtnBy);
        writeText(inputFieldBy, secondNumber);
        return this;
    }

    public CalcPage addNumbers (String firstNumber, String secondNumber) {
        writeText(inputFieldBy, firstNumber);
        click(plusBtnBy);
        writeText(inputFieldBy, secondNumber);
        return this;
    }

    public CalcPage plusClick () {
        click(plusBtnBy);
        return this;
    }


    public CalcPage divideNumbers (String firstNumber, String secondNumber) {
        writeText(inputFieldBy, firstNumber);
        click(divideBtnBy);
        writeText(inputFieldBy, secondNumber);
        return this;
    }

    public CalcPage addbracketLeft () {
        click(parenthasisLBtnBy);
        return this;
    }

    public CalcPage addbracketRight () {
        click(parenthasisRBtnBy);
        return this;
    }

    public CalcPage clickEqualBtn () {
        click(equalBtnBy);
        return this;
    }

    public CalcPage getResult (String expectedResult){
        click(historyDropdownBy);
        waitVisibility(historyResultFirstBy);
        assertTrue(historyResultFirstBy, expectedResult);
        //assertEquals(historyResultFirstBy, expectedResult);
        return this;
    }


}
