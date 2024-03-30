package Testng;

import org.testng.annotations.Test;

public class enable {
	@Test(enabled=false)
	public void apple() {
		System.out.println("Apple is fruit");
	}


	@Test( invocationCount=4)
	public void mango() {
		System.out.println("mango is fruit");
	}



	@Test(enabled=false)
	public void grapes() {
		System.out.println("grapes is fruit");
	}



	


}
