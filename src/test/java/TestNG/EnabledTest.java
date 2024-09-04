package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledTest {
	@Test(invocationCount = 4,priority = -2)
	public void demo1() {
		Reporter.log("demo1", true);
	}
	@Test(invocationCount = 0)
	public void demo2() {
		Reporter.log("demo1", true);
	}
	@Test(invocationCount = 0,enabled = false)
	public void demo3() {
		Reporter.log("demo1", true);
	}
}
