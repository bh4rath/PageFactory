package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//using FindBy for locating web elements
	@FindBy(id = "loginEmail") 
	WebElement userEmailID;
	
	@FindBy(id = "loginPassword")
	WebElement userPassword;
	
	@FindBy(id = "loginSubmit")
	WebElement clickSubmitButton;
	
	public void setUserEmail(String Email) {
		userEmailID.sendKeys(Email);
	}
	
	public void setUserPassword(String Password) {
		userPassword.sendKeys(Password);
	}
	
	public void clickOnLogin() {
		clickSubmitButton.click();
	}
}