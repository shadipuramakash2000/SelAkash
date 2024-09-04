package unit3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromProperties {
public static void main(String[] args) throws IOException  {
	
	//Step 1:Convert physical into java readable object
	FileInputStream fis= new FileInputStream("./src/main/resources/data.properties");//-->fileNotFoundExcetion
	//Step 2:Create properties class instance
	Properties property= new Properties();
	//Step 3:Load all key-value pairs to properties instance from fis
	property.load(fis);//io exception
	//Step 4:Fetch data
	String browser= property.getProperty("browser");
	System.out.println(browser);
}
}
