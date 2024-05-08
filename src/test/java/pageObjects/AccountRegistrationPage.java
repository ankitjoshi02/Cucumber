package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountRegistrationPage extends BasePage{
	WebDriver driver;
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "//input[@id='firstname']") private WebElement firsnameField;
	public WebElement getFirsnameField() {
		return firsnameField;
	}
	@FindBy(xpath = "//input[@id='lastname']") private WebElement lastNamefield;
	public WebElement getLastNamefield() {
		return lastNamefield;
	}
	@FindBy (xpath = "//input[@name='email']") private WebElement emailfield;
	public WebElement getEmailfield() {
		return emailfield;
	}
	
	@FindBy(xpath = "//input[@id='password']") private WebElement passwordTextField;
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	
	@FindBy(xpath = "//input[@id='password-confirmation']") private WebElement confirmPasswordTextfiedl;
	public WebElement getConfirmPasswordTextfiedl() {
		return confirmPasswordTextfiedl;
	}
	@FindBy(xpath = "//button[@title=\"Create an Account\"]//span[contains(text(),\"Create an Account\")]") private WebElement CreateAnAccountButton;
	public WebElement getCreateAnAccountButton() {
		return CreateAnAccountButton;
	}
	
	
	public void setFirstName(String fname) {
		firsnameField.sendKeys(fname);
	}
	public void setLastName(String lname) {
		lastNamefield.sendKeys(lname);
	}
	public void setEmailField(String email) {
		emailfield.sendKeys(email);
	}
	public void setPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	public void setConfirmPassword(String confirmPassword) {
		confirmPasswordTextfiedl.sendKeys(confirmPassword);
	}
	public void clickOnCreateAnAccountButton() {
		CreateAnAccountButton.click();
	}
}
