package demo;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

  
public class dataPro {
	
	@DataProvider(name="prototype")
	
	
	public static Object[][] test(Method name)
	{
		Object[][] obj = null;
		
		if(name.getName().equalsIgnoreCase("f"))
		{
		   obj = new Object[2][2];
		   
		obj[0][0]="vamsi";
		obj[0][1]= 0;
		
		obj[1][0]="sai";
		obj[1][1]=1;
	   }
		if(name.getName().equalsIgnoreCase("f1"))
		{
			obj = new Object[2][2];
			
			obj[0][0]="Hema";
			obj[0][1]=1;
			
			obj[1][0]="raghu";
			obj[1][1]=0;		
		}
		if(name.getName().equalsIgnoreCase("f2"))
		{
              obj = new Object[2][2];
			
			obj[0][0]="Hema-1";
			obj[0][1]=1;
			
			obj[1][0]="raghu-1";
			obj[1][1]=0;	
			
			
		}
		return obj;
	}
	
	  @Test(dataProvider="prototype")
  public void f(String a,int b) {
		  
		  System.out.println("arug :"  +a+"  integer: "+b);
	 
	}
	  @Test(dataProvider="prototype")
	  public void f1(String a,int b)
	  {
		  System.out.println("arug :"  +a+"  integer: "+b);
	  }
}
