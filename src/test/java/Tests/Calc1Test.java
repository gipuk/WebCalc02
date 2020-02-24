package Tests;

import org.junit.Test;
import pageobjects.CalcPage;
import pageobjects.MainPage;




public class Calc1Test extends BaseTest {

    @Test
    public void CalcTest () {
        //Go to web2.0calc page
        MainPage mainPage = new MainPage(driver);
        CalcPage calcPage = new CalcPage(driver);
        mainPage.goToWebCalc();
        mainPage.acceptCookies();


        //Calculate  35*999+(100/4)
        calcPage.multiplyNumbers("35","999");
        calcPage.plusClick();
        calcPage.addbracketLeft();
        calcPage.divideNumbers("100", "4");
        calcPage.addbracketRight();
        calcPage.clickEqualBtn();
        calcPage.openHistoryDropdown();
        calcPage.getResult("first","34990");

        //Calculate cos(pi)
        calcPage.clickClearBtn();
        calcPage.clickRadBtn();
        calcPage.clickCosBtn();
        calcPage.clickPiBtn();
        calcPage.clickEqualBtn();
        calcPage.getResult("next one", "-1");

        //Calculate sqrt(81)
        calcPage.clickClearBtn();
        calcPage.sqrtNumber("81");
        calcPage.clickEqualBtn();
        calcPage.getResult("next one", "9");

        //History dropdown assertion
        calcPage.getHistoryResults("9", "-1", "34990");

    }
}
