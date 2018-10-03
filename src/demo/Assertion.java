package demo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
  @Test
  public void f() {
	  
	  String s = "vamsi";
	  Assert.assertTrue(s.equals("vamsi"),"content matches");
	  System.out.println("Test case-1 over");
	
      }
  @Test
   public void f1()
   {
	   Float f = 10.345F;
	   Assert.assertTrue(f==10.345F,"content not matches");
	   System.out.println("Test case-2 completed");
   }
 
}
