package com.ibrahim.api;

import org.testng.Assert;



public class Utilities_Osa {
	/**
	 * thie method will take expected int values and compare them and 
	 * assert then provide the report. 
	 * @param expected
	 * @param actual
	 */
	public static void verifyStatu(int actual,int expected) {
		
		Assert.assertEquals(actual, expected);
	
	}
	/**
	 * thie method will take expected String values and compare them and 
	 * assert then provide the report. 
	 * @param expected
	 * @param actual
	 */
	public static void verifyStatu(String actual,String expected) {
		
		Assert.assertEquals(actual, expected);
	
	}

}
