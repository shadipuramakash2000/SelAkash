package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	public void demo() {
		System.out.println("Started");
		String s1= "hi";
		String s2= "Hi";
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);
		
	}
}
