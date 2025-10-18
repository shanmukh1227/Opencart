package pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Basepage{
	JavascriptExecutor js=(JavascriptExecutor)driver;

	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//input[@id='input-firstname']") WebElement Fbox;
	@FindBy(xpath="//input[@id='input-lastname']") WebElement Lbox;
	@FindBy(xpath="//input[@id='input-email']") WebElement Ebox;
	@FindBy(xpath="//input[@id='input-telephone']") WebElement phonenumber;
	@FindBy(xpath="//input[@id='input-password']") WebElement Pbox1;
	@FindBy(xpath="//input[@id='input-confirm']") WebElement Pbox2;
	@FindBy(xpath="//input[@name='agree']") WebElement scheck;
	@FindBy(xpath="//input[@value='Continue']") WebElement submit;
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement acreated;
	
	
	public void fname(String name1) {
		Fbox.sendKeys(name1);
	}
	
	public void lname(String name2) {
		Lbox.sendKeys(name2);
	}
	
	public void tmail(String email) {
		Ebox.sendKeys(email);
	}
	
	public void phonenum(String num) {
		phonenumber.sendKeys(num);
	}
	
	public void tpass(String pswd) {
		Pbox1.sendKeys(pswd);
	}
	
	public void tpass2(String pswd) {
		Pbox2.sendKeys(pswd);
	}
	
	public void tcheck() {
		js.executeScript("arguments[0].click()",scheck);
	
	}
	
	public void tsubmit() {
		
		js.executeScript("arguments[0].click()",submit);
	}
	
	public String getConfirm() {
		
		try {
			return (acreated.getText());
		}
		catch(Exception e) {
			return (e.getMessage());
		}
		
	}
	
	
	
	

}
