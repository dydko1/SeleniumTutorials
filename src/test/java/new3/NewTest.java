package new3;

import org.testng.annotations.Test;

public class NewTest {

	@Test(invocationCount = 5)
	public void f() {
		System.out.println("First method");
	}
	

	@Test(invocationCount = 2)
	public void f1() {
		System.out.println("Second method");
	}
	

	@Test(invocationCount = 1)
	public void f2() {
		System.out.println("Third method");
	}
}
