package Testng;

import org.testng.annotations.Test;

public class timeout {
	@Test
	public void lion() {
		System.out.println("Lion is animal");
	}
	@Test(timeOut=2000)
	public void Tiger() throws InterruptedException {
		System.out.println("Tiger is animal");
		Thread.sleep(3000);
	}
	@Test
	public void elephant() {
		System.out.println("elephant is animal");
	}
	@Test
	public void camel() {
		System.out.println("camel is animal");
	}

}
