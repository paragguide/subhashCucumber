package testcases;

import org.junit.Assert;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonUidTest extends Hook
{
	public static boolean b = false;
	
	@Given("i open {string} and go to {string}")
	public void i_open_and_go_to(String browser, String url) 
	{
	    openBrowser(browser,url);
	}
	@Given("i click signin")
	public void i_click_signin() 
	{
		signin.click();
	}
	@When("I enter valid userid {string}")
	public void i_enter_valid_userid(String userid) 
	{
		uid.sendKeys(userid);
	}
	@When("click continue button")
	public void click_continue_button() 
	{
		ctnbtn.click();
	}
	@Then("I shiould get password textbox")
	public void i_shiould_get_password_textbox() 
	{ 
		    try {
		System.out.println(err1.getText());
		    }
		    catch(Exception e)
		    {
		    	System.out.println("userid id valid..");
		    	if(pwd.isDisplayed())
		    	{
		    		b = true;
		    	}
		    	else
		    	{
		    		b = false;
		    		Assert.fail("password txt box not visible");
		    	}
		    }
	}

}
