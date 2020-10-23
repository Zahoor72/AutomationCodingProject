package ProTrainingTech.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethod.Home;
import Pro.AdvanceSharingCode;

public class Amazon_6 extends AdvanceSharingCode {
	//public WebDriver driver;
  @Test
  public void f() {
	  System.out.println("This is Test Annotation");
	  Home it=new Home(driver);
	  it.ClickOnIcon();
	  String ActualURL=driver.getCurrentUrl();
	  SoftAssert Confirm=new SoftAssert();
	  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
	  //System.out.println(ActualURL);
	  //Assert.assertEquals(ActualURL,"https://www.amazon.com/ref=nav_logo");
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
