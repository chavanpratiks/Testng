package Testng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class pomclient {
	WebDriver driver;
	pageobjectmodel p1;
  @Test
  public void login() {
	  p1.setusername("student");
	  p1.setpassword("Password123");
	  p1.clickxpath();
	  p1.Shownmessage();
	  
  }
  @AfterMethod
  public void logoutmessage() {
	  p1.logoutmessage();
  }

  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://practicetestautomation.com/practice-test-login/");
	  p1=new pageobjectmodel(driver);
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
  }

}
