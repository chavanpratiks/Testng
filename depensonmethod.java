package Testng;

import org.testng.annotations.Test;

public class depensonmethod {
	@Test
	public void apple() {
		System.out.println("Apple is fruit");
	}
	@Test
	public void mango() {
		System.out.println("mango is fruit");
	}
	@Test(dependsOnMethods="lemon")
	public void Grapes() {
		System.out.println("grapes is fruit");
	}
	@Test
	public void lemon() {
		System.out.println("lemon is fruit");
	}

}
