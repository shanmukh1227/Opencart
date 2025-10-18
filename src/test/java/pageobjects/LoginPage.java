package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Basepage{

	public LoginPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath="//input[@id='input-email']") WebElement email;
	@FindBy(xpath="//input[@id='input-password']") WebElement pswd;
	@FindBy(xpath = "//input[@value='Login']") WebElement btnLogin;
	
	public void emailtext(String uname) {
		email.sendKeys(uname);
	}
	
	public void pswdtext(String psd) {
		pswd.sendKeys(psd);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	public void emailclear() {
		email.clear();
	}
	
	public void pswdclear() {
		pswd.clear();
	}

}
