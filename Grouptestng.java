package Testng;

import org.testng.annotations.Test;

public class Grouptestng {
	@Test (groups = "regressiontest")
	public void testcas1() {
		
		System.out.println("Test case1");
	}
	@Test(groups="SmokeTesting")
	public void testcase2() {
		System.out.println("In Test case2");
	}
	@Test(groups= {"Regression","Smoke Testing"})
	public void testcase3() {
		System.out.println("In test case3");
	}

}
