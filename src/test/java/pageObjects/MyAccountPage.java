package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage extends BasePage{
	public MyAccountPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Thank you for registering with Main Website Store.']") private WebElement messageConfirmation;
	public WebElement getMessageConfirmation() {
		return messageConfirmation;
	}
	public String getConfirmationMessage() {
		try {
			return (messageConfirmation.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
	}
}
