package selenium123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramePat2 {
public static void main(String[] args) {
	  WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement signIn=driver.findElement(By.xpath("//span[.='Sign In']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(signIn).perform();
		
		driver.findElement(By.xpath("//a[.='login']")).click();
		driver.switchTo().frame("loginIframe");
		driver.findElement(By.id("userName")).sendKeys("2345678934");
		driver.findElement(By.id("close-pop")).click();
		driver.switchTo().defaultContent();
		
		driver.findElement(By.name("keyword")).sendKeys("toys");
		driver.findElement(By.className("searchformButton")).click();
		driver.quit();
}
}

