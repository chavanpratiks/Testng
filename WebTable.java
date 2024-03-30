package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTable {
	@Test()
	public void tablecase() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/chava/Downloads/WebTable.html");
		String Value =driver.findElement(By.xpath("//tr[3]/td[1]")).getText();
		System.out.println("Value is " +Value);
		
				
	}

}
