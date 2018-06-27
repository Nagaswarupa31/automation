package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

public class GroupsTest {
  @Test(groups="flavour")
  public void f() {
	  System.out.println("I am butersckotch");
  }
  @Test(groups="flavopur")
  public void g() {
	  System.out.println("I am ice-cream");
  }
  @Test(groups="fruit")
  public void h() {
	  System.out.println("I am grape");
  }
  @BeforeTest
  public void beforeTest() {
  }

}
