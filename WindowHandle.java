package Testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandle {
	@Test
	public void windowhandle() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.irctctourism.com/");
		String window =driver.getTitle();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Bus Tickets")).click();
		ArrayList <String> tabs = new  ArrayList<> (driver.getWindowHandles());
		driver.switchTo().window(tabs.get(2));
		String window2 = driver.getTitle();
		
		
		
	}

}
