package stepDefinitions;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import pageObjects.MyAccountPage;
import pageObjects.SignIn;
import io.cucumber.datatable.DataTable;

public class RegistrationSteps {
	WebDriver driver;
	HomePage hp;
	AccountRegistrationPage arp;
	MyAccountPage map;
	
	@Given("user redirected to registration page")
	public void user_redirected_to_registration_page() {
		BaseClass.getLogger().info("clicks on create an account button");
		hp = new HomePage(BaseClass.getDriver());
		hp.clickOnCreateAnAccount();
	}

	@When("the user enters the detail info below field")
	public void the_user_enters_the_detail_info_below_field(DataTable dataTable) {
		BaseClass.getLogger().info("user filling all the data");
		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
		arp=new AccountRegistrationPage(BaseClass.getDriver());
		arp.setFirstName(dataMap.get("firstname"));
		arp.setLastName(dataMap.get("lastname"));
		arp.setEmailField(dataMap.get("email"));
		arp.setPassword(dataMap.get("password"));
		arp.setConfirmPassword(dataMap.get("password"));
		//arp.clickOnCreateAnAccountButton();
	}

	@When("user click on Creat an account button")
	public void user_click_on_creat_an_account_button() {
		arp=new AccountRegistrationPage(BaseClass.getDriver());
		arp.clickOnCreateAnAccountButton();
	}

	@Then("use should redireted to thank you msg")
	public void use_should_redireted_to_thank_you_msg() {
		map=new MyAccountPage(BaseClass.getDriver());
		//String a = map.getConfirmationMessage();
		
		String confirmationmsg=map.getConfirmationMessage();
		if(confirmationmsg.equals("Thank you for registering with Main Website Store.")) {
			Assert.assertEquals(confirmationmsg, "Thank you for registering with Main Website Store.");
	}
	else {
			Assert.assertTrue(false);
		}
	}


}
