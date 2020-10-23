package PageClassesMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {
	public WebDriver driver;

	@FindBy(linkText = "Need help?")
	WebElement NeedHelpOption;

	@FindBy(linkText = "Forgot your password?")
	WebElement ForgotPasswordRecover;
	
	public SignInPage (WebDriver driver) { 
		this.driver=driver; 
		PageFactory.initElements(driver, this);
	}
	
	public void NeedHelpClick() {
		NeedHelpOption.click();
	}
	
	public void ForgotPasswordClick() {
		ForgotPasswordRecover.click();
	}
}
