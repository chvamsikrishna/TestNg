package demo;


import org.testng.annotations.Test;

public class DataPro1 {
	
  @Test(dataProvider="prototype",dataProviderClass=dataPro.class)
  
  public void f2(String a, int b) {
	  System.out.println("arug :"  +a+"  integer: "+b);
	  
	 }
}
