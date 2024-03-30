package Testng;

import org.testng.annotations.Test;

public class Attribtue1 {
	@Test(groups="Smoke")
	public void apple() {
		System.out.println("Apple is fruit");
	}
	@Test(groups="Smoke")
	public void pineapple() {
		System.out.println("PineApple is fruit");
	}
	@Test(groups={"Smoke","Regression"})
	public void Mango() {
		System.out.println("Mango is fruit");
	}
	@Test(groups={"Smoke","Functional"})
	public void lichy() {
		System.out.println("lichy is fruit");
	}
}
