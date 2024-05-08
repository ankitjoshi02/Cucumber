package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']") private WebElement createandAccountButton;
	public WebElement getCreateandAccountButton() {
		return createandAccountButton;
	}
	
	@FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]") private WebElement signInButton;
	public WebElement getSignInButton() {
		return signInButton;
	}
	
	public void clickOnCreateAnAccount() {
		 createandAccountButton.click();
	}
	public void clickOnSignInButton() {
		 signInButton.click();
	}
}
