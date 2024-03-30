package Testng;

import org.testng.annotations.Test;

public class Priorityexample3 {
	@Test(priority=2)
	public void facebook1() {
		System.out.println("login account");
			
	}
	@Test(priority=1)
public void facebook2() {
	System.out.println("Create a account");
}
	@Test(priority=3)
	public void facebook3() {
		System.out.println("Firstname");
	}
}
