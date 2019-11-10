package com.edureka.testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsDemo 
{
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		Reporter.log("Connection to the db or download the input files from the servers, establish a connection to the servers", true);
	}
	
	@BeforeTest
	public void beforeTestMethod()
	{
		Reporter.log("This method gets executed before each and every test block in testng.xml file", true);
	}
	
/*	@BeforeGroups
	public void beforeGroupMethod() 
	{
		
	}
	
	@AfterGroups
	public void afterGroupMethod()
	{
		
	}*/
	
	@BeforeClass
	public void beforeClassMethod()
	{
		Reporter.log("This method gets executed before each and every class in testng.xml file", true);
	}
	
	@BeforeMethod()
	public void preCondition()
	{
		Reporter.log("This gets executed before each and every test method in testng.xml file", true);
	}
	
	@Test
	public void testcase()
	{
		Reporter.log("This is the executable block of code", true);
	}
	
	@Test
	public void testcase2()
	{
		Reporter.log("This is the 2nd test case", true);
	}
	
	@AfterMethod
	public void postCondition()
	{
		Reporter.log("This gets executed after each and every test method in testng.xml file",true);
	}
	
	@AfterClass
	public void afterClassMethod()
	{
		Reporter.log("This method gets executed before each and every class in testng.xml file", true);
	}
	
	@AfterTest
	public void afterTestMethod()
	{
		Reporter.log("This method gets executed after each and every test block in testng.xml file", true);
	}
	@AfterSuite
	public void afterSuiteMethod()
	{
		Reporter.log("Send reports after the execution of the framework to the stakeholders", true);
	}
	

}
