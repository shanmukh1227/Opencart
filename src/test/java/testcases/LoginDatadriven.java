package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePagereg;
import pageobjects.LoginPage;
import pageobjects.Myaccountpage;
import testbase.BaseTest;
import utilities.DataProviders;

public class LoginDatadriven  extends BaseTest{
	
	@Test(dataProvider="LoginData",dataProviderClass =DataProviders.class, groups = {"Master","datadriven"})
	public void Logintest(String email,String pswd,String exp) {
		
		logger.info("**** Starting logindatadriventest  ****");
		logger.debug("capturing application debug logs....");
		
		try {
		
        HomePagereg hp=new HomePagereg(driver);
		
		hp.taccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clicklogin();
		logger.info("clicked on login link under myaccount..");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.emailtext(email);
		lp.pswdtext(pswd);
		lp.clickLogin();
		
		Myaccountpage mp=new Myaccountpage(driver);
		boolean val=mp.macount();
		
		//Assert.assertTrue(val);
		
		if(exp.equalsIgnoreCase("Valid"))
		{
			if(val==true)
			{
				mp.lgout();
				mp.getout();
				Assert.assertTrue(true);
			}
			else
			{
				
				Assert.assertTrue(false);
			}
		}
		
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(val==true)
			{
				mp.lgout();
				mp.getout();
				Assert.assertTrue(false);
			}
			else
			{
		
				Assert.assertTrue(true);
			}
		
		}
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished TC_002_LoginTest  ****");
	

}
}
