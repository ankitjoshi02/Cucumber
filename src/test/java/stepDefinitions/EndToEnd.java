package stepDefinitions;

import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.BaseClass;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.*;
import pageObjects.CheckoutPage;
import pageObjects.Dashboard;
import pageObjects.HomePage;
import pageObjects.ItemPage;
import pageObjects.OrderSuccessPage;
import pageObjects.PaymentPage;
import pageObjects.SearchResultPage;
import pageObjects.SignIn;
import factory.BaseClass;

public class EndToEnd {
	WebDriver driver;
	HomePage hp;
	SignIn si;
	Dashboard d;
	SearchResultPage sri;
	ItemPage ip;
	Properties p;
	CheckoutPage cp;
	PaymentPage pp;
	OrderSuccessPage osp;
	
	List<HashMap<String, String>> datamap;
	@Given("user redirected to th login page")
	public void user_redirected_to_th_login_page() {
		BaseClass.getLogger().info("go to url and click on sing in button");
		hp = new HomePage(BaseClass.getDriver());
		hp.clickOnSignInButton();
	}

	@When("user enteres email as {string} and pssword as {string}")
	public void user_enteres_email_as_and_pssword_as(String email, String password) {
		BaseClass.getLogger().info("user enter credential");
		si = new SignIn(BaseClass.getDriver());
		si.setEmail(email);
		si.setPassword(password);
	}

	@When("click on sign in button")
	public void click_on_sign_in_button() {
		BaseClass.getLogger().info("user click on sign in button");
		si = new SignIn(BaseClass.getDriver());
		si.clickOnSignInButton();
	}

	@When("enter enteres item name as {string} select pants as {string}")
	public void enter_enteres_item_name_as_select_pants_as(String string, String string2) {
		BaseClass.getLogger().info("user enter thhe item name on dashboard");
		d=new Dashboard(BaseClass.getDriver());
		d.clickonSearchField();
		d.setItemName(string);
		d.clickOnsuggestion3();
		
	}

	@When("click on item")
	public void click_on_item() {
		BaseClass.getLogger().info("user click on item 2");
		sri=new SearchResultPage(BaseClass.getDriver());
		sri.clickOnItem();
	}

	@When("select size, color and qty")
	public void select_size_color_and_qty() {
		BaseClass.getLogger().info("user select size color and qty");
		ip=new ItemPage(BaseClass.getDriver());
		ip.clickOnSelectSize();
		ip.clickOnColor();
		ip.setNumberOfitems("2");
		ip.isSuccessMessageDispalyed();
	}

	@When("clicks on Add to cart")
	public void clicks_on_add_to_cart() {
		BaseClass.getLogger().info("click on add to cart button");
		ip=new ItemPage(BaseClass.getDriver());
		ip.clickOnAddtoCart();
	}

	@When("click on cart")
	public void click_on_cart() {
		BaseClass.getLogger().info("click on cart icon");
		ip=new ItemPage(BaseClass.getDriver());
		ip.clickOnCart();
	}

	@When("click on Proceed to checkout button")
	public void click_on_proceed_to_checkout_button() {
		BaseClass.getLogger().info("click on proceed to checkout");
		ip=new ItemPage(BaseClass.getDriver());
		ip.clickOnProceedtoCheckout();
	}

	@When("user enteres the details state as {string} and country as {string} info")
	public void user_enteres_the_details_state_as_and_country_as_info(String string, String string2) {
		BaseClass.getLogger().info("verify added msg and edit entering details");
		cp=new CheckoutPage(BaseClass.getDriver());
		cp.isDisplayedmsg();
		cp.setCompanyName(BaseClass.randomeString());
		cp.setStreetAdressFirst(BaseClass.randomeString());
		cp.setStreetAdressSecond(BaseClass.randomeString());
		cp.setStreetAdressThird(BaseClass.randomeString());
		cp.setCity(BaseClass.randomeString());
		cp.setState(string);
		cp.setPostalCode(BaseClass.randomeNumber());
		cp.setCountry(string2);
		cp.settelephone(BaseClass.randomeNumber());
		cp.selectShippingMethods();
	}

	@When("click on next button")
	public void click_on_next_button() {
		BaseClass.getLogger().info("click on next button");
		cp=new CheckoutPage(BaseClass.getDriver());
		cp.clickOnNextButton();
	}

	@When("user click on Place your Order button")
	public void user_click_on_place_your_order_button() {
		BaseClass.getLogger().info("clcik on Place your order button");
		pp=new PaymentPage(BaseClass.getDriver());
		pp.clickOnCheckbox();
		pp.clickOnPlaceOrderButton();
	}

	@Then("user should redirected to confirmation page")
	public void user_should_redirected_to_confirmation_page() {
		BaseClass.getLogger().info("verify success msg");
		osp=new OrderSuccessPage(BaseClass.getDriver());
		boolean succesFullyDone=osp.issuccessMsgDispalyed();
		if(succesFullyDone==true) {
			Assert.assertEquals(succesFullyDone, true);
		}
		else {
			Assert.fail();
		}
		
	}

}
