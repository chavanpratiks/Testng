package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseActions {
	@Test()
	public void mouse() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
				driver.get("https://jqueryui.com/");
				driver.findElement(By.linkText("Draggable")).click();
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				Thread.sleep(1000);
				Actions mouse = new Actions(driver);
				Thread.sleep(1000);
			 	mouse.dragAndDropBy(driver.findElement(By.id("draggable")),100,100).build().perform();
						
	}

}
