package Testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HRMLoginapplyleave {
	@Test()
	public void hrmapply() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Leave")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("Assign Leave")).click();
		Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Abhishek chavan");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//textarea[@class='oxd-textarea oxd-textarea--active oxd-textarea--resize-vertical']")).sendKeys("Abhishek");
		Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
		Thread.sleep(1000);
		WebElement option = driver.findElement(By.xpath("\"//div[@class='oxd-select-text-input']"));
		Select select = new Select(option);
		select.selectByVisibleText("0");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2001-05-02");
//		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("2001-05-02");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active oxd-input--error']")).sendKeys("2001-05-09");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='oxd-select-text-input'])[2]")).sendKeys("HalfDay-Morning");
	
	}
}
