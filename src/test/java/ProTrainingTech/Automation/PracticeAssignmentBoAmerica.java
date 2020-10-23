package ProTrainingTech.Automation;

import org.testng.annotations.Test;

import practiceAssignment.FirstPage;

import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class PracticeAssignmentBoAmerica {
	public WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  FirstPage ab=new FirstPage(driver);
	  ab.ClickOnPersonal();
	  Thread.sleep(3000);
	  ab.ClickonChecking();
	  Thread.sleep(3000);
	  ab.ClickonOpenCheckingAccount();
	  
  }
  @BeforeClass
  public void beforeClass() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	  	driver=new ChromeDriver();
	  
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.bankofamerica.com/");
		driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  	  
	  Thread.sleep(3000);
	  driver.close();
  }

}
