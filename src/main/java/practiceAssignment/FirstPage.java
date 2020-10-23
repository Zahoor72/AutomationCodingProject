package practiceAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {

	public WebDriver driver;
	
	@FindBy(id = "NAV_PERSONAL")
	WebElement PersonalField;
	
	@FindBy(xpath = "(//*[text()='Checking'])[1]")
	WebElement CheckingField;
	
	@FindBy(id = "DCTAL13O")
	WebElement OpenCheckingAccount;
	
public FirstPage (WebDriver driver) { 
	this.driver=driver; 
	PageFactory.initElements(driver, this);
}	

	public void ClickOnPersonal() {
		PersonalField.click();
	}
	public void ClickonChecking() {
		CheckingField.click();
	}
	public void ClickonOpenCheckingAccount() {
		OpenCheckingAccount.click();
	}
}