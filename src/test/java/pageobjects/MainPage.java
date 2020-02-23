package pageobjects;

import org.openqa.selenium.WebDriver;


public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    String baseURL = "https://web2.0calc.com";

    public MainPage goToWebCalc() {
        driver.get(baseURL);
        return this;
    }
}










