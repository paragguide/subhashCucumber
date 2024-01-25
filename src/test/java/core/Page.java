package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class Page 
{
	public static WebDriver driver = null; // global
	
	public void openBrowser(String browser,String url)  // defined
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		
	//	driver.get(url); // but cannot go back,forward or referesh
		
		    // or
		driver.navigate().to(url); // go back,forward, refresh
		
		PageFactory.initElements(driver, this); // compulsory to read external xpath
		
		
		// implicit wait..
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30l));
		
		driver.manage().window().maximize();
	}
	
	public void closeBrowser()
	{
		driver.quit();
	}
	
	

	
	
	
	
	
}
