package testcases;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonPwdTest 
{
	public static boolean bb = false;
	@Given("userid is valid")
	public void userid_is_valid() 
	{
	    if(AmazonUidTest.b == true)
	    {
	    	bb = true;
	    }
	    else
	    {
	    	bb = false;
	    }
	}
	@When("i enter valid password {string}")
	public void i_enter_valid_password(String password) 
	{
	    if(bb == true)
	    {
	    	Hook.pwd.sendKeys(password);
	    	Hook.submit.click();
	    }
	}
	@Then("i should login")
	public void i_should_login() 
	{    
		  try {
	   System.out.println( Hook.err2.getText() );
	   bb = false;
		  }
		  catch(Exception e)
		  {
			  bb = true;
			  System.out.println("logged in");
		  }
	}


}
