package Testng;

import org.testng.annotations.Test;

public class Priorityexample1 {
	@Test(priority=4)
	public void Facebookpgm1() {
	System.out.println("Facebook close it");
	}
	@Test(priority=1)
	public void Facebookpgm2() {
	
		System.out.println("Open Facebook url");
	}
	@Test(priority=3)
	public void Facebookpgm4() {
		System.out.println("Enter Login");
	}
	@Test(priority=2)
	public void Facebookpgm3() {
		System.out.println("Enter email id and password");
	}
	

}
