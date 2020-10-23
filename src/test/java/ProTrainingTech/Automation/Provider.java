package ProTrainingTech.Automation;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageClassesMethod.Home;
import Pro.AdvanceSharingCode;

import org.testng.annotations.DataProvider;

public class Provider extends AdvanceSharingCode   {
  @Test(dataProvider = "search")
  public void f(String t) {
  System.out.println("This is Test Annotation");
  Home it=new Home(driver);
  it.ClickOnIcon();
  pictures();	  
  String ActualURL=driver.getCurrentUrl();
  SoftAssert Confirm=new SoftAssert();
  Confirm.assertEquals(ActualURL, "https://www.amazon.com/ref=nav_logo");
  //System.out.println(ActualURL);
  //Assert.assertEquals(ActualURL,"https://www.amazon.com/ref=nav_logo");
  it.EnterSearchWord(t);
  it.ClickOnSearchIcon();
  pictures();
  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"Phone"},
      new Object[] {"Home"},
      new Object[] {"Store"},
    };
  }
}
