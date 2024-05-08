package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//button[@class='action action-show-popup']") private WebElement newaddressButton;
	public WebElement getNewaddressButton() {
		return newaddressButton;
	}

	@FindBy(xpath = "//input[@name='company']")
	private WebElement companyNameTextField;

	public WebElement getCompanyNameTextField() {
		return companyNameTextField;
	}

	@FindBy(xpath = "//input[@name='street[0]']")
	private WebElement StreetAdressFirst;

	public WebElement getStreetAdressFirst() {
		return StreetAdressFirst;
	}

	@FindBy(xpath = "//input[@name='street[1]']")
	private WebElement StreetAdressSecond;

	public WebElement getStreetAdressSecond() {
		return StreetAdressSecond;
	}

	@FindBy(xpath = "//input[@name='street[1]']")
	private WebElement StreetAdressThird;

	public WebElement getStreetAdressThird() {
		return StreetAdressThird;
	}
	
	@FindBy(xpath = "//input[@name='city']") private WebElement citytextField;

	public WebElement getCitytextField() {
		return citytextField;
	}
	
	@FindBy(xpath = "//select[@name='region_id']") private WebElement state;
	
	public WebElement getState() {
		return state;
	}
	
	@FindBy(xpath = "//input[@name='postcode']") private WebElement postalCode;

	public WebElement getPostalCode() {
		return postalCode;
	}
	
	@FindBy(xpath = "//select[@name='country_id']") private WebElement country;
	
	public WebElement getCountry() {
		return country;
	}
	@FindBy(xpath = "//input[@name='telephone']") private WebElement telephone;

	public WebElement getTelephone() {
		return telephone;
	}
	@FindBy(xpath = "//input[@name='ko_unique_2']") private WebElement shippingMethodsRadioButton;
	
	public WebElement getShippingMethodsRadioButton() {
		return shippingMethodsRadioButton;
	}
	@FindBy(xpath = "//span[text()='Next']") private WebElement nextButton;
	
	public WebElement getNextButton() {
		return nextButton;
	}
	
	@FindBy(xpath = "//div[text()='Shipping Address']") private WebElement shipingAddressText;
	
	public WebElement getShipingAddressText() {
		return shipingAddressText;
	}

	// Actions method
	public void setCompanyName(String companyName) {
		companyNameTextField.sendKeys(companyName);
	}

	public void setStreetAdressFirst(String textStreetAdressFirst) {
		StreetAdressFirst.sendKeys(textStreetAdressFirst);
	}

	public void setStreetAdressSecond(String textStreetAdressSecond) {
		StreetAdressFirst.sendKeys(textStreetAdressSecond);
	}
	
	public void setStreetAdressThird(String textStreetAdressThird) {
		StreetAdressFirst.sendKeys(textStreetAdressThird);
	}
	
	public void setCity(String cityName) {
		citytextField.sendKeys(cityName);
	}
	public void setState(String stateSelect) {
		Select dropdown=new Select(state);
		dropdown.selectByVisibleText(stateSelect);
	}
	public void setPostalCode(String postal) {
		postalCode.sendKeys(postal);
	}
	public void setCountry(String countrySelection) {
		Select dropdown=new Select(country);
		dropdown.selectByVisibleText(countrySelection);
	}
	public void settelephone(String mobile) {
		telephone.sendKeys(mobile);
	}
	public void selectShippingMethods() {
		shippingMethodsRadioButton.click();
	}
	public void clickOnNextButton() {
		nextButton.click();
	}
	public void clickonNewAddressButton() {
		action.click(newaddressButton).perform();;
	}
	public void isDisplayedmsg() {
		shipingAddressText.isDisplayed();
	}
}
