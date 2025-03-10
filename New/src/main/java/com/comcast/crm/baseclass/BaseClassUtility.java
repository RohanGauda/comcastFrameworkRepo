package com.comcast.crm.baseclass;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClassUtility {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("---Before Suite---");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("---Before Class---");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("---Before Method---");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("---After Suite---");
	}
	
	@AfterClass
	public void afterlass() {
		System.out.println("---After Class---");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("---After Method---");
	}

}
