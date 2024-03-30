package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforemethodAftermethodExample1 {
	@BeforeMethod()
	public void Method1() {
		System.out.println("It is succefully printed the language 1");
	}
	@Test()
	public void Method2() {
		System.out.println("It is succefully printed Language 2");
	}
	@AfterMethod()
	public void Method3() {
		System.out.println("Its is succefully printed Language 3");
	}

}
