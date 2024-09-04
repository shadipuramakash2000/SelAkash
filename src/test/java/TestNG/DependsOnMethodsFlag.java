package TestNG;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsFlag {

	@Test
	public void navigateToApp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		Thread.sleep(2000);
		driver.quit();
		//Assert.fail();
		
		
	}
	
	@Test(dependsOnMethods = "navigateToApp")
	public void logininToApp() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("Admin");
		driver.findElement(By.id("password")).sendKeys("admin123");
	    driver.findElement(By.id("last")).click();
	    
	    Thread.sleep(2000);
	    driver.quit();
		
	}
}
