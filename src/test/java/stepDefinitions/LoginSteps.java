package stepDefinitions;

import org.openqa.selenium.WebDriver;

import factory.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.HashMap;
import java.util.List;

import org.junit.*;
import pageObjects.Dashboard;
import pageObjects.HomePage;
import pageObjects.SignIn;
import utilities.DataReader;

public class LoginSteps {
	WebDriver driver;
	HomePage hp;
	SignIn si;
	Dashboard d;
	
	List<HashMap<String, String>> datamap; //Data driven

	@Given("user navigate to login page")
	public void user_navigate_to_login_page() {
		BaseClass.getLogger().info("go to url and click on sing in button");
		hp = new HomePage(BaseClass.getDriver());
		hp.clickOnSignInButton();
	}

	@When("user enters email as {string} and password as {string}")
	public void user_enters_email_as_and_password_as(String email, String password) {
		BaseClass.getLogger().info("user enter credential");
		si = new SignIn(BaseClass.getDriver());
		si.setEmail(email);
		si.setPassword(password);
	}

	@When("clicks on sign in button")
	public void clicks_on_sign_in_button() {
		BaseClass.getLogger().info("user click on sign in button");
		si = new SignIn(BaseClass.getDriver());
		si.clickOnSignInButton();
	}

	@Then("user should be redirected to the MyAccount page")
	public void user_should_be_redirected_to_the_my_account_page() {
		BaseClass.getLogger().info("vaerify welcome msg");
		d = new Dashboard(BaseClass.getDriver());
		boolean r = d.isWelcomeMessageDispalyed();
//		if(r==true) {
//			Assert.assertTrue(true);
//		}
//		else {
//			Assert.fail();
//		}
		Assert.assertEquals(r, true);
	}

	@When("user click on dropdown icon")
	public void user_click_on_dropdown_icon() {
		d.clickOnDropdownIcon();
	}

	@When("user click on signout button")
	public void user_click_on_signout_button() {
		d.clickOnSignOutbutton();
	}
	
	//** Data Driven Test **//
	@Then("user should redirected to the My Account page by passing email and password from excel row {string}")
	public void user_should_redirected_to_the_my_account_page_by_passing_email_and_password_from_excel_row(String rows) {
	       datamap=DataReader.data(System.getProperty("user.dir")+"\\testData\\Luma_Login_Data.xlsx", "Sheet1");

	        int index=Integer.parseInt(rows)-1;
	        String email= datamap.get(index).get("username");
	        String pwd= datamap.get(index).get("password");
	        String exp_res= datamap.get(index).get("res");

	        si=new SignIn(BaseClass.getDriver());
	        si.setEmail(email);
	        si.setPassword(pwd);

	        si.clickOnSignInButton();;
	        d=new Dashboard(BaseClass.getDriver());	
	        try
	        {
	            boolean targetpage=d.isWelcomeMessageDispalyed();
	            System.out.println("target page: "+ targetpage);
	            if(exp_res.equals("Valid"))
	            {
	                if(targetpage==true)
	                {
	                    Dashboard d=new Dashboard(BaseClass.getDriver());
	                    d.clickOnDropdownIcon();
	                    d.clickOnSignOutbutton();
	                    Assert.assertTrue(true);
	                }
	                else
	                {
	                    Assert.assertTrue(false);
	                }
	            }

	            if(exp_res.equals("Invalid"))
	            {
	                if(targetpage==true)
	                {
	                    d.clickOnDropdownIcon();
	                    d.clickOnSignOutbutton();
	                    Assert.assertTrue(false);
	                }
	                else
	                {
	                    Assert.assertTrue(true);
	                }
	            }


	        }
	        catch(Exception e)
	        {

	            Assert.assertTrue(false);
	        }
	}

}
