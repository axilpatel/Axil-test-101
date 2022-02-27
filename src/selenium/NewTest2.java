package selenium;

import org.testng.annotations.Test;

public class NewTest2 {
  @Test(groups = "smoke")
  public void Test4() {
	  System.out.println("test4");
  }
  
  @Test(groups ="sanity")
  public void Test5() {
	  System.out.println("test5");
  }
  
  
}



