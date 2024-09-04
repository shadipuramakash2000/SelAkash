package selenium123;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {
public static void main(String[] args) throws InterruptedException {
	 WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//driver.findElement(By.xpath("//button[.='Click for JS Alert']")).click();
		//driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
		driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
		Alert a= driver.switchTo().alert();
		System.out.println(a.getText());
		//a.dismiss();
		a.sendKeys("qwe");
		a.accept();
		Thread.sleep(2000);
		
		String result= driver.findElement(By.id("result")).getText();
		System.out.println(result);
		driver.quit();
		
}
}
