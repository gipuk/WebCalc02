package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    By historyDropdownBy = By.cssSelector("span.glyphicon-chevron-down");
    By historyResultFirstBy = By.xpath("//*[@id=\"histframe\"]/ul/li/p[1]");
    By historyResultSecondBy = By.xpath("//*[@id=\"histframe\"]/ul/li[1]/p[1]");
    By historyResultCosBy = By.xpath("//*[@id=\"histframe\"]/ul/li[2]/p[1]");
    By historyResultOperationBy = By.xpath("//*[@id=\"histframe\"]/ul/li[3]/p[1]");
    By clearBtnBy = By.id("BtnClear");
    By radRadioBtnBy = By.id("trigorad");
    By cosBtnBy = By.id("BtnCos");
    By piBtnBy = By.id("BtnPi");
    By sqrtBtnBy = By.id("BtnSqrt");



    public CalcPage multiplyNumbers (String firstNumber, String secondNumber) {
        writeText(inputFieldBy, firstNumber);
        click(multiplyBtnBy);
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

    public CalcPage openHistoryDropdown (){
        click(historyDropdownBy);
        return this;
    }

    public CalcPage getResult (String operationType, String expectedResult){
        if (operationType == "first"){
            waitVisibility(historyResultFirstBy);
            assertTrue(historyResultFirstBy, expectedResult);
        } else if (operationType == "next one") {
            waitVisibility(historyResultSecondBy);
            assertTrue(historyResultSecondBy, expectedResult);
        } else {
            System.out.println("unknown operation");

        }
        return this;
    }


    public CalcPage clickRadBtn () {
        click(radRadioBtnBy);
        return this;
    }

    public CalcPage clickCosBtn () {
        click(cosBtnBy);
        return this;
    }

    public CalcPage clickPiBtn () {
        click(piBtnBy);
        return this;
    }

    public CalcPage clickClearBtn () {
        click(clearBtnBy);
        return this;
    }

    public CalcPage sqrtNumber (String number) {
        writeText(inputFieldBy, number);
        click(sqrtBtnBy);
        return this;
    }

    public CalcPage getHistoryResults (String expectedResult1, String expectedResult2, String expectedResult3) {
        waitVisibility(historyResultSecondBy);
        waitVisibility(historyResultCosBy);
        waitVisibility(historyResultOperationBy);
        assertTrue(historyResultSecondBy, expectedResult1);
        assertTrue(historyResultCosBy, expectedResult2);
        assertTrue(historyResultOperationBy, expectedResult3);
        return this;
    }
}

