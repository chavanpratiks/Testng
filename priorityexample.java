package Testng;

import org.testng.annotations.Test;

public class priorityexample {
	@Test(priority=2)
	public void login() {
		System.out.println("Login account");
		
	}
	@Test(priority=1)
	public void createnewaccount() {
		System.out.println("Create New Account");
		
	}
	@Test(priority=3)
	public void Sendemail() {  
		System.out.println("send email");
		
	}

}
