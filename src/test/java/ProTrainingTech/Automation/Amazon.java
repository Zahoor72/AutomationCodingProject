package ProTrainingTech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethod.ForgotPasswordPage;
import PageClassesMethod.Home;
import PageClassesMethod.SignInPage;
import Pro.AdvanceSharingCode;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Amazon extends AdvanceSharingCode {
	//public WebDriver driver;
  @Test(priority = 1)
  public void f() throws IOException {
	  System.out.println("This is Test Annotation");
	  Home it=new Home(driver);
	  it.ClickOnIcon();
	  pictures();	  
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //System.out.println(ActualURL);
	  //Assert.assertEquals(ActualURL,"https://www.amazon.com/ref=nav_logo");
	  it.EnterSearchWord();
	  it.ClickOnSearchIcon();
	  pictures();
	  //String ActualURL=driver.getCurrentUrl();
	  //System.out.println(ActualURL);
	  //Assert.assertEquals(ActualURL,"https://www.amazon.com/s?k=Phone&ref=nb_sb_noss_2");
	  WebElement CustomerLinkService= it.CustomerServiceVerification();
	  boolean Customer= CustomerLinkService.isDisplayed();
	  Assert.assertEquals(Customer, true);
	  Confirm.assertAll();
	  
	  
  }
 // @Test(priority = 2)
  public void ForgotPasswordFunction() {
	  Home it=new Home(driver);
	  SignInPage ob=new SignInPage(driver);
	  ForgotPasswordPage forgot=new ForgotPasswordPage(driver);
	  it.SignInClick();
	  it.SignInHover();
	  ob.NeedHelpClick();
	  ob.ForgotPasswordClick();
	  forgot.EmailFieldKeys();
	  forgot.ContinueButtonClick();
	  	  
}
/*@BeforeClass
@Parameters("browser")
  public void beforeClass(String browser) {
		browsers(browser);
	
	  //System.out.println("This is Before Class Annotation");
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
	  	//driver=new ChromeDriver();
	  //System.setProperty("webdriver.gecko.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
	    //driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//driver.get("https://www.amazon.com");
		//driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  System.out.println("This is After Class Annotation");
	  
	  Thread.sleep(6000);
	  driver.close();  
  }

  public void browsers (String br) {
	  if (br.equalsIgnoreCase("Chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		  	driver=new ChromeDriver();
		  	driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
			
	  }else if(br.equalsIgnoreCase("FireFox")) {
		  System.setProperty("webdriver.gecko.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\geckodriver.exe");
		    driver=new FirefoxDriver();
			driver.get("https://www.amazon.com");
			driver.manage().window().maximize();
		  
	  }
	  
  }*/
}
