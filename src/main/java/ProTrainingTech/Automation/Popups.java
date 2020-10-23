package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.expedia.com");
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//button[@class='uitk-faux-input uitk-form-field-trigger'])[1]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Oct 6, 2020']")).click();
		driver.findElement(By.xpath("(//*[text()='Done'])[2]")).click();
		
				
	}

}
