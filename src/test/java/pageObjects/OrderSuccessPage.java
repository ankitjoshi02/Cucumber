package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderSuccessPage extends BasePage{

	public OrderSuccessPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//span[text()='Thank you for your purchase!']") private WebElement successMsg;

	public WebElement getSuccessMsg() {
		return successMsg;
	}
	public boolean issuccessMsgDispalyed() {
		try {
		return successMsg.isDisplayed();
		}
		catch(Exception e) {
			return (false);
		}
	}
}
