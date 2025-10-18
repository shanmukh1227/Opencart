package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Myaccountpage extends Basepage {

	public Myaccountpage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(xpath="//h2[text()='My Account']") WebElement myacc;
	@FindBy(xpath="//a[@class='list-group-item'][normalize-space()='Logout']") WebElement lout;
	@FindBy(xpath="//a[@class='btn btn-primary']") WebElement goout;
	
	public boolean macount() {
		try {
		return (myacc.isDisplayed());
		}
		catch(Exception e) {
			return false;
		}
	}
	
	public void lgout() {
		lout.click();
	}
	
	public void getout() {
		goout.click();
	}

}
