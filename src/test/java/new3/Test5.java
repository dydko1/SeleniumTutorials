package new3;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test5 {

	@AfterTest
	void method2() {
		System.out.println("After Test");
	}

	@Test
	void method3() {
		System.out.println("Test33!!");
	}

	@Test
	void method4() {
		System.out.println("Test44!!");
	}

	@BeforeMethod
	void method5() {
		System.out.println("Before Method55");
	}

	@AfterMethod
	void method7() {
		System.out.println("After Method6666666666666");
	}

	@Test
	//@BeforeSuite
	void method6() {
		System.out.println("Before Suite 77777777777777777777777777777777!!");
	}

	@BeforeTest
	void method1() {
		System.out.println("Before Testxxx");
	}
	
}
