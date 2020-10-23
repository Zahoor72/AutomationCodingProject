package PageClassesMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	public WebDriver driver;  // this WebDriver driver has been created as global

	@FindBy(xpath = "(//div[@id='nav-logo']/a/span)[1]")
	WebElement AmazonIcon;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement SearchBoxFields;
	
	@FindBy(xpath = "(//*[@class='nav-input'])[2]")
	WebElement SearchIconClick;
	
	@FindBy(id = "nav-link-accountList")
	WebElement SignInOption;
	
	@FindBy(xpath = "//*[text()='Sign in']")
	WebElement SignInButton;
	
	@FindBy(xpath = "//*[text()='Customer Service']")
	WebElement Customer;
	
	
	public Home (WebDriver driver) { //WebDriver driver has been created as argument of the method
		this.driver=driver; // "this" keyword is used to point to the global variable
		PageFactory.initElements(driver, this); //PageFactory helps in initializing the elements in backend
	}	
		//Global variables are those variables that are created outside of the method but inside the class
		
	public void ClickOnIcon () {
		AmazonIcon.click();
	}
	
	public void EnterSearchWord () {
		SearchBoxFields.sendKeys();
	}
	
	public void ClickOnSearchIcon () {
		SearchIconClick.click();
	}
	
	public void SignInClick () {
		Actions ob=new Actions(driver);
		ob.moveToElement(SignInOption).build().perform();
	}
	
	public void SignInHover ( ) {
		Actions ob=new Actions(driver);
		ob.moveToElement(SignInButton).click().build().perform();
	}	
	
	public WebElement CustomerServiceVerification() {
		return Customer;
	}
}
