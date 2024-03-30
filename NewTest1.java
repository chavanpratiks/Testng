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

public class NewTest1 {
	public WebDriver driver;
  @Test(priority =1,groups="First")
  public void customer() {
	  driver.findElement(By.xpath("(//a[@class='nav-a  '])[2]")).click();
  }
  @Test(priority=2,groups="gadget")
  public void Registry () {
	  driver.findElement(By.xpath("(//a[@class='nav-a  '])[3]")).click();
  }
  @Test(priority=3,groups="gadget")
  public void GiftCards() {
	  driver.findElement(By.xpath("(//a[@class='nav-a  '])[4]")).click();
  }
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  driver.get("https://www.amazon.in/");
	  System.out.println("Title is" + driver.getTitle());
	  
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println(driver.getTitle());
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  driver= new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.manage().window().maximize();
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.close();
  }

}
