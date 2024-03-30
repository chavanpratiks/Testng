package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testng1 {

	@BeforeClass()
	public void beforeclass() {
		System.out.println("In before test case");
	}
	@AfterClass()
	public void afterclass() {
		System.out.println("In After test case");
	}
	@BeforeMethod()
	public void beforetestcase() {
		System.out.println("In Before test case method");
	}
	@AfterMethod()
		public void aftertestcase() {
			System.out.println("In After test case method 2");
		}
	
	@Test
	public void testcase1() {
		System.out.println("In testcase 1");
	}
	@Test
	public void testcase2() {
		System.out.println("In test case2 pgm");
		
	}

}
