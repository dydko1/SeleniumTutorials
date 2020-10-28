package new3;

import org.testng.annotations.Test;

public class PriorityTest {
	
  @Test(priority = 100, enabled = true)
  public void f1() {
	  System.out.println("Method f1\t");
  }
  
  @Test(priority = 90)
  public void f2() {
	  System.out.println("Method f2\t");
  }
  
  @Test(priority = -100)
  public void f3() {
	  System.out.println("Method f3\t");
  }
}
