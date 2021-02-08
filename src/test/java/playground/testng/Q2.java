package playground.testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Q2 {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  System.out.println(n.toString() + ',' + s);
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In the BeforeMethod of class Q2");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In the AfterMethod of class Q2");

  }


  @DataProvider
  public Object[][] dp() {
	  System.out.println("In the dataProvider method of class Q2");
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("In the BeforeClass method of class Q2");

  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In the AfterClass method of class Q2");

  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In the BeforeTest method of class Q2");

  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In the AfterTest method of class Q2");

  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In the BeforeSuite method of class Q2");

  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In the AfterSuite method of class Q2");

  }

}
