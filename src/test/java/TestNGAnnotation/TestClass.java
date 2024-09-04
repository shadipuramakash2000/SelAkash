package TestNGAnnotation;

import org.testng.annotations.Test;

public class TestClass extends Baseclass{
 
	@Test
	public void testMethod() {
		System.out.println("@Test");
	}
}
