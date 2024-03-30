package Testng;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class parametrization {
	WebDriver driver;

	@Parameters({ "username", "password" })
	@Test
	public void f(String un, String ps) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
		driver.findElement(By.xpath("//div[@id='max-width']")).sendKeys(ps);
		driver.findElement(By.xpath("//div[@id='max-width']")).click();
	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterMethod
	public void afterMethod() {
		System.out.println(driver
				.findElement(
						By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]"))
				.getText());
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}

}
