package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgDemo 
{
	@Test
	public void display()
	{
		Reporter.log("This is my first Test method");
	}
	
	@Test
	public void sample()
	{
		Reporter.log("This is another test method");
	}

}
