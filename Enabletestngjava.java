package Testng;

import org.testng.annotations.Test;

public class Enabletestngjava {
	@Test(enabled=false)
	public void enabletest() {
		System.out.println("In test case 1");
	}
	@Test
	public void test2() {
		System.out.println("In test case 2");
	}
	@Test()
	public void test3() {
		System.out.println("In test case 3");
	}

}

