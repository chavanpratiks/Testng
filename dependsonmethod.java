package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethod {
	@Test

	public void test1() {
		System.out.println("Testcase1");
		
	}
	@Test(dependsOnMethods= {"test1"})
	public void test2() {
		Assert.assertTrue(false);
		
	}
	@Test(dependsOnMethods= {"test2"})
	public void test3() {
		System.out.println("Testcase3");
		
	}
	


}
