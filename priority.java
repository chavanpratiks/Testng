package Testng;

import org.testng.annotations.Test;

public class priority {
	@Test(priority=5)
public void apple() {
	System.out.println("Apple is fruit");
	
}
	@Test(priority=5)
	public void mango() {
		System.out.println("mango is fruit");
		
	}
	@Test(priority=4)
	public void awala() {
		System.out.println("Awala is fruit");
		
	}
	@Test(priority=3)
	public void banana() {
		System.out.println("banana is fruit");
		
	}
	@Test(priority=2)
	public void grapes() {
		System.out.println("grapes is fruit");
		
	}

}
