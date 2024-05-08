package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    WebDriver driver;
    Actions action;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.action = new Actions(driver); // Initialize Actions inside the constructor
        PageFactory.initElements(driver, this);
    }
}
