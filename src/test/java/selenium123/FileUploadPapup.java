package selenium123;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPapup {
public static void main(String[] args) throws AWTException, InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.xpath("//div[@data-val='exp']")).click();
	driver.findElement(By.xpath("//button[.='Upload Resume']")).click();
	StringSelection file= new StringSelection("C:\\Users\\HP\\Downloads\\Akash_resume- FINAL.pdf");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(file, null);
	Robot r= new Robot();
	Thread.sleep(3000);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(3000);
	//driver.quit();

}
}
