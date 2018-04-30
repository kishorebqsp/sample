package pom;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class FB_Loginpage extends Basepage {
	
	@FindBy(id="email")
	private WebElement un;
	
	@FindBy(name="pass")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement login;
	
	@FindBy(xpath="//a[.='Sign up for an account.']")
	private WebElement errmsg;
	
	public FB_Loginpage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
    
	public void setuSername(String un1)
	{
		un.sendKeys(un1);
	}
	
	public void setPassword(String pwd1)
	{
		pwd.sendKeys(pwd1);
	}
	
	public void clickLogin()
	{
		login.click();
	}
	
	public void verifyeermsg()
	{
		elementpresent(errmsg);
	}

}
