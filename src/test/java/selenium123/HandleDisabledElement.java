package selenium123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDisabledElement {
	public static void main(String[]args) throws InterruptedException { 
	
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       JavascriptExecutor js=(JavascriptExecutor)driver;
       js.executeScript("window.location=arguments[0]", "https://www.instagram.com/");
       WebElement loginBTN=driver.findElement(By.xpath("//button[.='Log in']"));
       js.executeScript("arguments[0].removeAttribute('disabled','disabled')", loginBTN);
       Thread.sleep(2000);
       js.executeScript("arguments[0].click()", loginBTN);
       Thread.sleep(2000);
       String errorMsg=driver.findElement(By.xpath("//span[contains(.,'your password was incorrect.')]")).getText();
       System.out.println(errorMsg);
       Thread.sleep(2000);
       driver.quit();
       
	}
}
