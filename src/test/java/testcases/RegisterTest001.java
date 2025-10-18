package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.HomePagereg;
import pageobjects.RegisterPage;
import testbase.BaseTest;

public class RegisterTest001 extends BaseTest {
	
	@Test(groups = {"Regression","Master"})
	public void Regtest() {
		logger.info("***** Starting TC001_AccountRegistrationTest  ****");
		logger.debug("this is a debug msg");
		
		try {
		HomePagereg hp=new HomePagereg(driver);
		
		hp.taccount();
		logger.info("clicked on myaccount");
		hp.treg();
		logger.info("clicking regpage");
		
		RegisterPage rp=new RegisterPage(driver);
		
		logger.info("providing customer details");
		rp.fname(randomeString().toUpperCase());
		rp.lname(randomeString().toUpperCase());
		rp.tmail(randomeString()+"@gmail.com");
		rp.phonenum(randomeNumber());
		String pas=randomAlphaNumeric();
		rp.tpass(pas);
		rp.tpass2(pas);
		rp.tcheck();
		rp.tsubmit();
		
		
		Assert.assertEquals(rp.getConfirm(),"Your Account Has Been Created!");
		logger.info("test passed");
		}
		catch(Exception e) {
			logger.error("Test failed: " + e.getMessage());
			Assert.fail("Test failed: " + e.getMessage());
		}
		finally 
		{
		logger.info("***** Finished AccountRegistrationTest1 *****");
		}
	}

}
