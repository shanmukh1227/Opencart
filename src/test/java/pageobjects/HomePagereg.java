package pageobjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagereg extends Basepage{
	 WebDriverWait wait;

	public HomePagereg(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, Duration.ofSeconds(15));
	}
	
	@FindBy(xpath="//span[normalize-space()='My Account']") WebElement account;
	@FindBy(xpath="//a[normalize-space()='Register']") WebElement register;
	@FindBy(xpath="//a[normalize-space()='Login']") WebElement login;
	
	public void taccount() {
		 wait.until(ExpectedConditions.elementToBeClickable(account)).click();
		
	}
	public void treg() {
		wait.until(ExpectedConditions.elementToBeClickable(register)).click();
	}
	
	public void clicklogin() {
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	
	
	
	
}
