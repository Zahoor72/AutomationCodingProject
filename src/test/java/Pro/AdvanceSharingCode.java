package Pro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.ScreenshotException;
import org.testng.annotations.AfterClass;

public class AdvanceSharingCode {
	public WebDriver driver;

  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browser) {
	  if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
			  	driver=new ChromeDriver();
			  	driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
				
		  }else if(browser.equalsIgnoreCase("FireFox")) {
			  System.setProperty("webdriver.gecko.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
			    driver=new FirefoxDriver();
				driver.get("https://www.amazon.com");
				driver.manage().window().maximize();
			  
		  }
  }

  @AfterClass
  public void afterClass() throws InterruptedException, IOException {
System.out.println("This is After Class Annotation");
	  
	  Thread.sleep(6000);
	  pictures();
	  driver.close(); 
  }

  public void pictures () throws IOException {
	  Date dt=new Date();
	  String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
	  File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(di,new File ("C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\Pictures\\"+sd));
	  
  }
}
