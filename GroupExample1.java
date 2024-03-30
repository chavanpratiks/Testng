package Testng;

import org.testng.annotations.Test;

public class GroupExample1 {
	@Test(groups="Regression")
	public void testcase1() {
		System.out.println("Test case1 is executed");
	}
	@Test(groups="BVT")
	public void testcase2() {
		System.out.println("Test case2 is executed in Regression");
	}
	@Test(groups= {"BVT","Regression"})
	public void testcase3() {
		System.out.println("Test case3 is execute in BVT");
	}

}

