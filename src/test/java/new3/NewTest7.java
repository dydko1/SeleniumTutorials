package new3;

import org.testng.annotations.Test;

public class NewTest7 {

	@Test()
	public void method01() {
		System.out.println("Mthod 01: " + Thread.currentThread().getId());
	}

	@Test()
	public void method02() {
		System.out.println("Mthod 02: " + Thread.currentThread().getId());
	}

	@Test()
	public void method03() {
		System.out.println("Mthod 03: " + Thread.currentThread().getId());
	}

	@Test()
	public void method04() {
		System.out.println("Mthod 04: " + Thread.currentThread().getId());
	}

	@Test()
	public void method05() {
		System.out.println("Mthod 05: " + Thread.currentThread().getId());
	}
}
