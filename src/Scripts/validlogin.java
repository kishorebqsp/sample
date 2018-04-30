package Scripts;

import org.testng.annotations.Test;

import pom.FB_HomePage;
import pom.FB_Loginpage;
import Generic.Base_test;
import Generic.Excel;

public class validlogin extends Base_test{
	@Test
	public void vl()
	{
		
		FB_Loginpage l=new FB_Loginpage(driver);
		l.setuSername("kishoreb017@gmail.com");
		l.setPassword("");
		l.clickLogin();
		FB_HomePage f=new FB_HomePage(driver);
		f.e
		
	}
	

}
