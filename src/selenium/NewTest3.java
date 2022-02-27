package selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest3 {
  
	SoftAssert softAssert = new SoftAssert();
	
	
	@Test(priority = 1, groups = "smoke") 
	public void createuser() {
		System.out.println("I am in home test");
		System.out.println("Before assertion");
		softAssert.assertTrue(4>3, "Veryfing Element");
		System.out.println("After assertion");
		Assert.assertEquals("abc", "abc");
		softAssert.assertAll(); // to report the failure
	}
		@Test(priority = 2, dependsOnMethods = "createuser" )
		public void edituser() {
			System.out.println("Before assertion");
			softAssert.assertTrue(2>3, "Veryfing Element");
			System.out.println("After assertion");
			
			softAssert.assertAll();
		}
		
		@Test (priority = 3, dependsOnMethods = "edituser" )
		public void deleteuser() {
			System.out.println("I am in end test");
			System.out.println("Before assertion");
			softAssert.assertTrue(2>3, "Veryfing Element1");
			Assert.assertEquals("abc", "abc1");
			System.out.println("After second assertion");
			
			
			softAssert.assertAll();
	}
}

  
  
  

