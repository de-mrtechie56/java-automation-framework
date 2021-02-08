package playground.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Q5 {
  @Test(priority=1)
  public void Test1() {
	  System.out.println("Test 1 with priority 1");
  }
  
  @Test(priority=2)
  public void Test2() {
	  System.out.println("Test 2 with priority 2");
  }
  
  @Test(priority=1,dependsOnMethods={"Test1"})
  public void Test3() {
	  System.out.println("Test 3 depends on Test1");
  }

  @Test(priority=1)
  public void Test4() {
	  System.out.println("Test 4 with priority 1");
  }
  @Test(priority=2)
  public void Test5() {
	  System.out.println("Test 5 with priority 2");
	  Assert.assertEquals(1, 2);
  }
  @Test(priority=3)
  public void Test6() {
	  System.out.println("Test 6 with priority 3");
  }
  @Test(dependsOnMethods= {"Test5","Test6"})
  public void Test7() {
	  System.out.println("Test 7 depends on Test 5 and Test 6");
  }
}
