package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppDemo 
{
	@Test(groups= {"Smoke Testing", "Regression Testing"})
	public void createUser()
	{
		Reporter.log("User created successfully");
	}
	
	@Test(groups= {"Regression Testing"}, priority = 1, enabled = false)
	public void editUser()
	{
		Reporter.log("User info has been edited");
	}
	
	@Test(groups= {"Regression Testing"})
	public void deleteUser()
	{
		Reporter.log("User deleted successfully");
	
	}
	
	
}
