package Testng;

import org.testng.annotations.Test;

public class Attribute2 {

	@Test(groups= "smoke")
   public void peru() {
	System.out.println("Grapes is fruit");
}
	@Test(groups= {"smoke","Functional"})
	   public void Watermellon() {
		System.out.println("Watermellon is fruit");
	}
	@Test(groups= "smoke")
	   public void Bannnana() {
		System.out.println("Bannana is fruit");
	}
	@Test(groups= "smoke")
	   public void dhrakse() {
		System.out.println("dhrakese is fruit");
	}

	}


