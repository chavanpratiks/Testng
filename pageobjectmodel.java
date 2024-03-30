package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class pageobjectmodel {
	WebDriver driver;

	public pageobjectmodel(WebDriver driver) {
		
		this.driver = driver;
	}
	public void setusername(String un) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}
	public void setpassword(String ps) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	public void clickxpath() {
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	public void Shownmessage() {
		System.out.println(driver.findElement(By.xpath("//strong[contains(text(),'Congratulations student. You successfully logged in!')]")).getText());
	}
	public void logoutmessage() {
		driver.findElement(By.xpath("//a[@class='wp-block-button__link has-text-color has-background has-very-dark-gray-background-color']")).click();
	}
	

}
