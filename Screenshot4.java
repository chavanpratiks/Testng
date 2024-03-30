package Testng;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Screenshot4 {
	@Test()
	public void screenshot4() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		
		File Src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(Src, new File("C:\\Users\\chava\\OneDrive\\Documents\\MAss\\sc5.jpg"));
		}
		catch(Exception e){
			
		}
	}

}
