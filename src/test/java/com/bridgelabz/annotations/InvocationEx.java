package com.bridgelabz.annotations;

import org.testng.annotations.Test;

public class InvocationEx {

	@Test(invocationCount=5)  
	 public void testcase1()  
	 {  
	     System.out.println("testcase50");  
	 }  
}
