package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }
    By acceptAllCookiesBtnBy = By.id("cookieconsentallowall");

    String baseURL = "https://web2.0calc.com";

    public MainPage goToWebCalc() {
        driver.get(baseURL);
        return this;
    }

    public MainPage acceptCookies (){
        waitVisibility(acceptAllCookiesBtnBy);
        click(acceptAllCookiesBtnBy);
        return this;
    }

}










