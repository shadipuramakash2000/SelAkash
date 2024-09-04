package unit3;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptFromExcel {
public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
	FileInputStream fis= new FileInputStream("./src/test/resources/Book1auto.xlsx");
	Workbook wb =WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	
	Map<String,String> map=new HashMap<String, String>();
	DataFormatter df= new DataFormatter();
	
    for(int i=0;i<=sheet.getLastRowNum();i++) {
    	String Key= df.formatCellValue(sheet.getRow(i).getCell(0));
    	String Value= df.formatCellValue(sheet.getRow(i).getCell(1));
    	map.put(Key, Value);
    }
	System.out.println(map);
	wb.close();
    
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get(map.get("url"));
	
	long time =Long.parseLong(map.get("timeouts"));
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	
	driver.findElement(By.name("email")).sendKeys(map.get("username"));
	driver.findElement(By.id("password")).sendKeys(map.get("password"));
	driver.findElement(By.id("last")).click();
	
	Thread.sleep(2000);
	driver.quit();
}
}
