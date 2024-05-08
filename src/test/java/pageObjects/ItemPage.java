package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ItemPage extends BasePage {

	public ItemPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//button[@id='product-addtocart-button']") private WebElement addToCartButton;
	public WebElement getAddToCartButton() {
		return addToCartButton;
	}
	@FindBy(xpath = "//div[text()='36']") private WebElement sizeSelection;
	public WebElement getSizeSelection() {
		return sizeSelection;
	}
	@FindBy(xpath = "//div[@option-label='Green']") private WebElement colorSelections;
	public WebElement getColorSelections() {
		return colorSelections;
	}
	@FindBy(xpath = "//input[@id='qty']") private WebElement qtyCount;
	public WebElement getQtyCount() {
		return qtyCount;
	}
	@FindBy(xpath = "//div[@data-bind=\"html: $parent.prepareMessageForHtml(message.text)\"]") private WebElement successMsg;
	public WebElement getSuccessMsg() {
		return successMsg;
	}
	@FindBy(xpath = "//a[@class='action showcart']") private WebElement cartButton;
	public WebElement getCartButton() {
		return cartButton;
	}
	@FindBy(xpath = "//button[@title='Proceed to Checkout']") private WebElement ProceedtoCheckoutButton;
	public WebElement getProceedtoCheckoutButton() {
		return ProceedtoCheckoutButton;
	}

	public boolean isSuccessMessageDispalyed() {
		try {
		return successMsg.isDisplayed();
		}
		catch(Exception e) {
			return (false);
		}
	}
	
	//Action methods
	public void clickOnSelectSize() {
		sizeSelection.click();
	}
	public void clickOnColor() {
		colorSelections.click();
	}
	public void setNumberOfitems(String itemCount) {
		qtyCount.clear();
		qtyCount.sendKeys(itemCount);
	}
	public void clickOnAddtoCart() {
		addToCartButton.click();
	}
	public void clickOnCart() {
		action.click(cartButton).perform();
	}
	public void clickOnProceedtoCheckout() {
		ProceedtoCheckoutButton.click();
	}
	
}
