package selenium123;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTitleUrlRefresh {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location=arguments[0]","https://www.myntra.com/");//navigate to an application
	Thread.sleep(2000);
	System.out.println(js.executeScript("return document.title"));//in order to fetch the title of the url
	System.out.println(js.executeScript("return document.URL"));
	js.executeScript("history.go(0)");//refresh the web page
	Thread.sleep(2000);
	driver.quit();
	
	
}


}
