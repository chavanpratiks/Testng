package Testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Amazontest {
	WebDriver driver;
  @Test(priority=1)
  public void Fresh() {
	  driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
  }
  @Test(priority=2)
  public void Amazonin() {
	  driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[2]")).click();
  }
  @Test(priority=3)
  public void Sell() {
	  driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[3]")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.amazon.in/");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
