package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePagereg;
import pageobjects.LoginPage;
import pageobjects.Myaccountpage;
import testbase.BaseTest;

public class LoginTest001 extends BaseTest{
	
	@Test(groups = {"Sanity","Master"})
	public void Logintest() {
		
		logger.info("**** Starting TC_002_LoginTest  ****");
		logger.debug("capturing application debug logs....");
		
		try {
		
        HomePagereg hp=new HomePagereg(driver);
		
		hp.taccount();
		logger.info("clicked on myaccount link on the home page..");
		hp.clicklogin();
		logger.info("clicked on login link under myaccount..");
		
		LoginPage lp=new LoginPage(driver);
		logger.info("Entering valid email and password..");
		lp.emailtext(p.getProperty("email"));
		lp.pswdtext(p.getProperty("password"));
		lp.clickLogin();
		
		Myaccountpage mp=new Myaccountpage(driver);
		boolean val=mp.macount();
		
		Assert.assertTrue(val);
		
		}
		catch(Exception e) {
			Assert.fail();
		}
		logger.info("**** Finished TC_002_LoginTest  ****");
	}

}
