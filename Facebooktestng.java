package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Facebooktestng {
	@Test()
public void facebook() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
			
}
}
