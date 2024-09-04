package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillraytest {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/login.php?type=register");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	SkillrayPage resiter= new SkillrayPage(driver);
	resiter.clickresiterLink();
	resiter.setFirstName("admin");
	resiter.setLastName("vinod");
	resiter.setEmail("akashxcvbn@gmail.com");
	resiter.setPassword("akash");
	resiter.setRepassword("akash");
	resiter.clickresiter();
	Thread.sleep(2000);
	driver.quit();
	}

}
