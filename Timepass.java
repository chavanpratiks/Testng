package Testng;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Timepass {
	@Test()
	public void tp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(1000);
		Actions mouse = new Actions(driver);
			mouse.moveToElement(driver.findElement(By.linkText("Fashion"))).build().perform();
			
		
				
	}

}
