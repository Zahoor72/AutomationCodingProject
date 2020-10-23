package ProTrainingTech.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimplePopUps {

	private Object TimeUnit;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[text()='ACCEPT']")).click();
		
		driver.findElement(By.xpath("//button[@onclick='pushAlert()']")).click();
				
				//Thread.sleep(3000);
				driver.switchTo().alert().accept();
				
				driver.findElement(By.xpath("//button[@onclick='pushConfirm()']")).click();
				//Thread.sleep(3000);
				driver.switchTo().alert().accept(); // To click on OK
				//driver.switchTo().alert().dismiss(); // To click on CANCEL
				
				driver.findElement(By.xpath("//button[@onclick='promptConfirm()']")).click();
				
				driver.switchTo().alert().sendKeys("Yes"); // If you want to Type Yes
				driver.switchTo().alert().sendKeys("No"); // If you want to Type No
				
				//Thread.sleep(3000);
				driver.switchTo().alert().accept();
				
				//WebElement BigPopUp=driver.findElement(By.xpath("//img[@class='sgpb-popup-close-button-1']"));
				//BigPopUp.click();
	}

}
