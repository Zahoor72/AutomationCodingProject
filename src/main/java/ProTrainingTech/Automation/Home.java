package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Home {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//How to open the site Chrome Browser
		//i) Set up Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		//ii) Call Chrome driver constructor
		WebDriver driver=new ChromeDriver();
		//iii) Open the site
		driver.get("https://www.facebook.com");
		//iv) How to maximize the Browser
		driver.manage().window().maximize();
		//v) How to refresh the Browser
		Thread.sleep(6000);
		driver.navigate().refresh();
		//vi) How to go backward
		driver.navigate().back();
		//vii) How to go forward
		driver.navigate().forward();
		
		// How to find locators
		/* i)id
		 * ii)linkText
		 * iii)partialLinkText
		 * iv)className
		 * v)xpath
		 * vi)tagName
		 * vii)cssSelector
		 * viii)name */
		 // How to store locator into variable
		WebElement CreateAnAccount=driver.findElement(By.id("u_0_2"));
		// How to click on element
		CreateAnAccount.click();
		WebElement ForgotlinkClick=driver.findElement(By.linkText("Forgot Password?"));
		
		//ForgotlinkClick.click();
		WebElement ForgotlinkPartial=driver.findElement(By.partialLinkText("Forgot"));
		//ForgotlinkPartial.click();
		Thread.sleep(6000);
		WebElement FirstNameFind=driver.findElement(By.name("firstname"));
		FirstNameFind.sendKeys("Zahoor");
		
		WebElement LastNameFind=driver.findElement(By.name("lastname"));
		LastNameFind.sendKeys("Ahmed");
		
		WebElement MobileEmail=driver.findElement(By.name("reg_email__"));
		MobileEmail.sendKeys("zahoor72@gmail.com");
		
		WebElement NewPasswordEnter=driver.findElement(By.name("reg_passwd__"));
		NewPasswordEnter.sendKeys("abcd123@");
		
	 	WebElement ConfirmEmail=driver.findElement(By.name("reg_email_confirmation__"));
		ConfirmEmail.sendKeys("zahoor72@gmail.com");
		
		Thread.sleep(6000);
		Select BirthMonth=new Select(driver.findElement(By.name("birthday_month")));
		BirthMonth.selectByVisibleText("Apr");
		
		Select BirthDay=new Select(driver.findElement(By.id("day")));
		BirthDay.selectByValue("5");
		
		Select BirthYear=new Select(driver.findElement(By.id("year")));
		BirthYear.selectByIndex(49);
		
		WebElement GenderButton=driver.findElement(By.xpath("(//input[@id='u_1_3'])"));
		GenderButton.click();
		
		
		
	}
	

}
