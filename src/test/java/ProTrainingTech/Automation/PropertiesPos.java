package ProTrainingTech.Automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethod.Home;
import Pro.AdvanceSharingCode;

public class PropertiesPos extends AdvanceSharingCode {
  @Test
  public void f() throws IOException {
	  System.out.println("This is Test Annotation");
	  Home it=new Home(driver);
	  it.ClickOnIcon();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //System.out.println(ActualURL);
	  //Assert.assertEquals(ActualURL,"https://www.amazon.com/ref=nav_logo");
	  
	  Properties pro=new Properties();
	  FileInputStream ob=new FileInputStream(System.getProperty("user.dir")+"\\Drivers\\Amazon.properties");
	  pro.load(ob);
	  String name=pro.getProperty("Name");
	  System.out.println("This is to print Properties Project ="+name);
	  it.EnterSearchWord();
	  it.ClickOnSearchIcon();
	  //String ActualURL=driver.getCurrentUrl();
	  //System.out.println(ActualURL);
	  //Assert.assertEquals(ActualURL,"https://www.amazon.com/s?k=Phone&ref=nb_sb_noss_2");
	  WebElement CustomerLinkService= it.CustomerServiceVerification();
	  boolean Customer= CustomerLinkService.isDisplayed();
	  Assert.assertEquals(Customer, true);
	  Confirm.assertAll();
  }
}
