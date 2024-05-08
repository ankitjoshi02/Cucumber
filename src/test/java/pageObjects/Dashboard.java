package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Dashboard extends BasePage{
	WebDriver driver;
	public Dashboard(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class=\"panel header\"]//span[@class=\"logged-in\"][contains(text(),'Welcome')]") private WebElement welcomemssage;
	public WebElement getWelcomemssage() {
		return welcomemssage;
	}
	public boolean isWelcomeMessageDispalyed() {
		try {
		return welcomemssage.isDisplayed();
		}
		catch(Exception e) {
			return (false);
		}
	}
	
	@FindBy(xpath = "//input[@id='search']") private WebElement searchTextField;
	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
	@FindBy(xpath = "//button[@title='Search']") private WebElement searchButton;
	public WebElement getSearchButton() {
		return searchButton;
	}
	
	@FindBy(xpath = "//div[@class=\"panel header\"]//button[@type=\"button\"]") private WebElement dropdownicon;
	public WebElement getDropdownicon() {
		return dropdownicon;
	}
	
	@FindBy(xpath = "//div[@aria-hidden=\"false\"]//a[normalize-space()=\"Sign Out\"]") private WebElement signOutButton;
	public WebElement getSignOutButton() {
		return signOutButton;
	}
	
	//Actions method
	public void clickonSearchField() {
		searchTextField.click();
	}
	
	public void setItemName(String itemName) {
		searchTextField.sendKeys(itemName);
	}
	public void clickOnSearchButton() {
		searchButton.submit();
	}
	public void clickOnDropdownIcon() {
		dropdownicon.click();
	}
	public void clickOnSignOutbutton() {
		signOutButton.click();
	}

}
