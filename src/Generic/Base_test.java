package Generic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Base_test implements Constant{
	public WebDriver driver;
	@BeforeMethod
	public void openapp(String Url)
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		 driver=new FirefoxDriver();
		driver.get(Url);
	}
	
	@Test
	public void login(String username,String password)
	{
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
	}
	
	@AfterMethod
	public void closeapp()
	{
driver.close();
}
}
