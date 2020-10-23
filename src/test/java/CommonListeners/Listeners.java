package CommonListeners;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
	public WebDriver driver;
	
	public void onTestStart(ITestResult result) {
	System.out.println("The Test is Started");
	}
		
	public void onTestSuccess(ITestResult result) {
		Date dt=new Date();
		  String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		  File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(di,new File ("C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\Pictures\\Pass\\"+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult result) {
		Date dt=new Date();
		  String sd=dt.toString().replace(" ", "_").replace(":", "_")+".png";
		  File di=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  try {
			FileHandler.copy(di,new File ("C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\Pictures\\Fail\\"+sd));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
