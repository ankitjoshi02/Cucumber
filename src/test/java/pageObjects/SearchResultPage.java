package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage extends BasePage{
	public SearchResultPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@class='product-item-link'][normalize-space()='Aether Gym Pant']") WebElement item1;
	public WebElement getItem1() {
		return item1;
	}
	
	//Actions methods
	public void clickOnItem() {
		action.click(item1).perform();
	}
	

}
