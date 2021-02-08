package playground.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Q6 {
  @Parameters({"Course2","Course1","Course3","Course4"})
  
  @Test()
  public void Test1(String C1,String C2,@Optional("default-testparam3")String C3,String C4) {
	  System.out.println("Test 1 with suite parameters Course1 as " + C1 +" and  Course2 as " + C2);
	  System.out.println("Test 1 with test parameters Course3 as " + C3 +" and  Course4 as " + C4);
  }
}
