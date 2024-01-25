package testcases;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import core.Hook;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch 
{
	public static boolean cc = false;
	@Given("i am logged in")
	public void i_am_logged_in() 
	{
	    if(AmazonPwdTest.bb == true)
	    {
	    	cc = true;
	    }
	    else
	    {
	    	cc = false;
	    }
	}
	@When("^i search (.*)")
	public void i_search(String product) 
	{
		Hook.searchbox.clear();
	   Hook.searchbox.sendKeys(product);
	   
	   Actions a = new Actions(Hook.driver);
	   a.sendKeys(Keys.ENTER).perform();
	}
	@Then("i get result")
	public void i_get_result() 
	{
	   System.out.println( Hook.resultmsg.getText() );
	      if(Hook.resultmsg.isDisplayed())
	      {
	    	  System.out.println("pass");
	      }
	      else
	      {
	    	  Assert.fail("search fail");
	      }
	}
}
