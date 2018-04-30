package Generic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class Basepage {
	
	public WebDriver driver;
	
	public Basepage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void verfyelement(String title)
	{
		WebDriverWait wait=new WebDriverWait(driver,10);
		try
		{
		wait.until(ExpectedConditions.titleContains(title));
		}
		catch(Exception e)
		{
			org.testng.Assert.fail();
		}
	}	
		
		public void elementpresent(WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,10);
			try{
			wait.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e)
			{
				Assert.fail();
		}
	}

}
