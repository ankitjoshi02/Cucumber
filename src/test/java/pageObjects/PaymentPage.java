package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {

	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//span[normalize-space()='Place Order']") private WebElement PlaceOrderButton;
	public WebElement getPlaceOrderButton() {
		return PlaceOrderButton;
	}
	@FindBy(xpath = "//input[@name='billing-address-same-as-shipping']") private WebElement checkbox;
	
	public WebElement getCheckbox() {
		return checkbox;
	}
	

	//Action methods
	public void clickOnPlaceOrderButton() {
		((JavascriptExecutor)driver).executeScript("arguments[0].click();", PlaceOrderButton);
	}
	public void clickOnCheckbox() {
		checkbox.click();
	}
	
	
}
