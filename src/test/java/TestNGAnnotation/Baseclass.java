package TestNGAnnotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Baseclass {

	@BeforeSuite
	public void suiteSetUp() {
		System.out.println("@BeforSuite");
	}
	
	@BeforeTest
	public void testSetUp() {
		System.out.println("@BeforeTest");
	}
	
	@BeforeClass
	public void classSetUp() {
		System.out.println("@BeforeClass");
	}
	
	@BeforeMethod
	public void methodSetUp() {
		System.out.println("@BeforeMethod");
	}
	
	@AfterMethod
	public void methodTearDwon() {
		System.out.println("@AfterMethod");
	}
	
	@AfterClass
	public void classTearDwon() {
		System.out.println("@AfterClass");
	}
	
	@AfterTest
	public void testTearDwon() {
		System.out.println("@AfterTest");
	}
	
	@AfterSuite
	public void suiteTearDwon() {
		System.out.println("@AfterSuite");
	}
}
