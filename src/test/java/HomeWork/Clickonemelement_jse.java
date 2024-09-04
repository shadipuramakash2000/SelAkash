package HomeWork;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonemelement_jse {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	JavascriptExecutor ts= (JavascriptExecutor)driver;
	ts.executeScript("window.location=arguments[0]","https://www.amazon.in/");
	WebElement tf=driver.findElement(By.id("twotabsearchtextbox"));
	WebElement searchBTN=driver.findElement(By.id("nav-search-submit-button"));
	ts.executeScript("arguments[0].value=arguments[1]",tf,"bags");
	ts.executeScript("arguments[0].click()", searchBTN);
	driver.quit();
}
}
