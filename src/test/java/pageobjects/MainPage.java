package pageobjects;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;



public class MainPage extends BasePage {


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


    }


     }

}

