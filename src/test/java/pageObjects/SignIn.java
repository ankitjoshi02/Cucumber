package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignIn extends BasePage{

	public SignIn(WebDriver driver) {
		super(driver);
	}
	@FindBy (xpath = "//input[@id='email']") private WebElement emailField;
	public WebElement getEmailField() {
		return emailField;
	}
	@FindBy(xpath = "//input[@title='Password']") private WebElement passField;
	public WebElement getPassField() {
		return passField;
	}

	@FindBy(xpath = "//fieldset[@class=\"fieldset login\"]//span[contains(text(),\"Sign In\")]") WebElement buttonsignIn;
	public WebElement getButtonsignIn() {
		return buttonsignIn;
	}
	
	
	//action methods
	public void setEmail(String email) {
		emailField.sendKeys(email);
	}
	public void setPassword(String password) {
		passField.sendKeys(password);
	}
	public void clickOnSignInButton() {
		buttonsignIn.click();
	}
	
}
