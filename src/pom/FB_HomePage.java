package pom;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Basepage;

public class FB_HomePage extends Basepage{
	
	@FindBy(xpath="(//div[.='Account Settings'])[5]")
	private WebElement logout_logo;
	
	@FindBy(xpath="(//span[@class='_54nh'])[13]")
	private WebElement signout;
	
	@FindBy(xpath="(//div[@class='_1mf _1mj'])[1]")
	private WebElement textArea;
	
	@FindBy(xpath="(//i[@class='img sp_3OxEQobvphM sx_73cfea'])[2]")
	private WebElement dropdown;
	
	@FindBy(xpath="(//span[.='Friends'])[2]")
	private WebElement friends;
	
	@FindBy(xpath="//span[.='Post']")
	private WebElement post;
	
	@FindBy(xpath="//i[@class='img sp_VpoefcySbme sx_915c97']")
	private WebElement close;
	

	public FB_HomePage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	
	public void clickLogout_logo()
	{
		logout_logo.click();
	}
	
	public void clickSignout()
	{
		signout.click();
	}
	
	public void setTextArea(String msg) throws InterruptedException
	{
		textArea.click();
		Thread.sleep(3000);
		textArea.sendKeys(msg);
	}
	
	public void clickDropDown()
	{
		dropdown.click();
	}
	
	public void clickFriends()
	{
		friends.click();
	}
	
	public void clickPost()
	{
		post.click();
	}
	
    public void clickClose()
	{
    	close.click();
	}
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
