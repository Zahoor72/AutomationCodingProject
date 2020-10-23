package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		/*WebElement Ids=driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/div/div/form/div/button)[1]"));
		Ids.click();*/
		

		WebElement Emailfield=driver.findElement(By.xpath("(//input[@data-testid='royal_email'])"));
		Emailfield.sendKeys("zahoor72@hotmail.com");
		
		WebElement Passwordfield=driver.findElement(By.xpath("(//input[@data-testid='royal_pass'])"));
		Passwordfield.sendKeys("abcde1234");
		
		WebElement Loginbutton=driver.findElement(By.xpath("(//button[@data-testid='royal_login_button'])"));
		Loginbutton.click();
		
	}

}
