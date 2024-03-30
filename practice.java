package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class practice {
	WebDriver driver;
  @Test(priority=1)
  
  public void clickbestseller() {
	  driver.findElement(By.partialLinkText("Best"));
	  
  }
@Test(priority=2)
  
  public void clicktoday() {
	  driver.findElement(By.partialLinkText("Today's Deal"));
	  
  }
@Test(priority=3)

public void sell() {
	  driver.findElement(By.partialLinkText("Sell"));
	  
}
  @BeforeMethod
  public void openamazon() {
	  driver.get("https://www.amazon.com/");
	  System.out.println("Tile is " +driver.getTitle());
  }

  @AfterMethod
  public void closebrowser() {
	  driver.close();
  }

  @BeforeTest
  public void openbrowser() {
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  System.out.println("Title "+ driver.getTitle());
  }

  @AfterTest
  public void afterTest() {
  }

}
