package Assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
	public void demo() {
		System.out.println("Started");
		String s1= "hi";
		String s2= "Hi";
		SoftAssert soft= new SoftAssert();
		
		soft.assertEquals(s1,s2);
		System.out.println(s1);
		System.out.println(s2);
		soft.assertAll();//if we won't use this method it won't throw the error
	}
}
