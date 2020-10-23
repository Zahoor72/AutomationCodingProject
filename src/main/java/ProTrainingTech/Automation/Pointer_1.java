package ProTrainingTech.Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pointer_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\Zahoor Ahmed\\eclipse-workspace\\Automation\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	
		//driver.get("https://www.amazon.com");
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions obj=new Actions(driver);
		//obj.moveToElement(driver.findElement(By.xpath("//*[text()='Hello, Sign in']"))).build().perform();
		//obj.moveToElement(driver.findElement(By.xpath("//*[text()='Create a List']"))).click().build().perform();
		driver.switchTo().frame(0);
		WebElement Drag=driver.findElement(By.id("draggable"));
		WebElement Drop=driver.findElement(By.id("droppable"));
		obj.dragAndDrop(Drag, Drop).build().perform();
		
		driver.switchTo().parentFrame();
		WebElement sort=driver.findElement(By.linkText("Selectable"));
		String windowhandle=driver.getWindowHandle();// Parent Window Handle
		System.out.println(windowhandle);
		obj.keyDown(Keys.SHIFT).click(sort).build().perform();// Opening the link for new window
		
		Set<String> otherwindows=driver.getWindowHandles();//Storing window handles for both windows
		for(String Windows:otherwindows) {
			System.out.println(Windows);
			if(Windows.equalsIgnoreCase(windowhandle)) {
				System.out.println("This is paren window");
				
			}else {
				System.out.println("This is other window");
				driver.switchTo().window(Windows);
			}
		}
String window=driver.findElement(By.xpath("//*[contains(text(),Reorder elements in ')]")).getText();
System.out.println(window);
driver.switchTo().window(windowhandle);

System.out.println(driver.getCurrentUrl());

	}

}
