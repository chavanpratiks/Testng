package Testng;

import org.testng.annotations.Test;

public class threetestcaseexample1 {
	@Test()
	public void testcase1() {
		System.out.println("Test case1 is executed");	
		}
	@Test(enabled=false)
	public void testcase2() {
		System.out.println("Test case2 is executed");	
		}
	@Test()
	public void testcase3() {
		System.out.println("Test case3 is executed");	
		}

}
