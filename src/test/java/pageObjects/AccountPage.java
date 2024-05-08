package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {

	public AccountPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='My Account']") private WebElement accountText;
	public WebElement getAccountText() {
		return accountText;
	}
	
	@FindBy(xpath = "//div[@class=\"panel header\"]//button[@type=\"button\"]") private WebElement dropdown;
	public WebElement getDropdown() {
		return dropdown;
	}
	
	@FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='Sign Out']") private WebElement signOutButton;
	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	//actions
	public boolean isAccountPageExists() {
		try {
			return accountText.isDisplayed();
		}
		catch (Exception e) {
			return (false);
		}
	}
	
	public void clickOnDropdown() {
		dropdown.click();
	}
	public void clickOnSignOut() {
		signOutButton.click();
	}

}
