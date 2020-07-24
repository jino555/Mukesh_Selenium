package BaseClassTest;

import org.testng.annotations.Test;

import SeleniumWebDriver_3.BaseClass;

public class BaseClassTest2 extends BaseClass{
	
	@Test
	public void verifyCurrentURL() {
		
		
		System.out.println( "Current url " +driver.getCurrentUrl());
	}
	
	
	
	
	
	
	
	

}
