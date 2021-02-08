package playground.testng;

import org.testng.annotations.Test;

public class Q4 {
  @Test(priority=1)
  public void Test1() {
	  System.out.println("Test 1 with priority 1");
  }
  
  @Test(priority=2)
  public void Test2() {
	  System.out.println("Test 2 with priority 2");
  }
  
  @Test(priority=3)
  public void Test3() {
	  System.out.println("Test 3 with priority 3");
  }

  @Test(priority=1)
  public void Test4() {
	  System.out.println("Test 4 with priority 1");
  }
}
