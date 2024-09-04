package selenium123;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramePat1 {
public static void main(String[] args) throws InterruptedException {
    WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//WebElement a= driver.findElement(By.xpath("//iframe[@name='callout']"));
	driver.switchTo().frame(0);
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[.='Stay signed out']")).click();
	System.out.println("ok");
	driver.switchTo().defaultContent();
	driver.findElement(By.name("q")).sendKeys("Homeof Dragon");
	driver.findElement(By.name("btnK")).submit();
	
	Thread.sleep(3000);
	driver.quit();
	
}
}

