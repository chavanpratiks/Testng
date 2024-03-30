package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
	@BeforeSuite
	public void beforesuit() {
		System.out.println("before suit is ruuning");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("before test is ruuning");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println("before class is ruuning");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("before method is ruuning");
	}
	@AfterSuite
	public void Aftersuit() {
		System.out.println("After suit is ruuning");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method is ruuning");
	}
	@AfterClass
	public void Afterclass() {
		System.out.println("After class is ruuning");
	}
	@Test
	public void test() {
		System.out.println("before suit is ruuning");
	}
	

}
