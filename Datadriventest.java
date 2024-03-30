package Testng;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Datadriventest {
	WebDriver driver;
	String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index",acturl;
  @Test(dataProvider = "getlogindata")
  public void logindata(String un, String ps) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  
  acturl =driver.getCurrentUrl();
  Assert.assertEquals(acturl, expurl);
  }
  
  
  @AfterMethod
  public void afterMethod() {
	  if(acturl.equals(expurl)) {
		  driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  }
	  else
		{
			System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
		}
  }

  
  @DataProvider
  public Object[][] getlogindata() {
    return new Object[][] {
      new Object[] { "Admin", "admin123" },
      new Object[] { "Kavya", "kavya123" },
      new Object[] { "abhishek", "abhishek123" },
      new Object[] { "Admin", "admin123" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
