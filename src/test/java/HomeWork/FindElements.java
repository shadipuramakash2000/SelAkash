package HomeWork;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("kitchen");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 List<WebElement> ele= driver.findElements(By.xpath("//span[contains(.,'kitchen')]"));
	 System.out.println(ele.size());
	String ele2=ele.get(4).getText();
	System.out.println(ele2);
	// ele.get(4).click();
	 for(WebElement ele3: ele) {
		 System.out.println("started");
		 if(ele3.getText().equals("kitchen sink")) {
			 System.out.println("YES");
			 System.out.println(ele3.getText());
			 ele3.click();
			 
			 break;
		 }
	 }
	 
}
}
