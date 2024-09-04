package unit3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteToProperties {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("./src/main/resources/data.properties");
	Properties property= new Properties();
	property.load(fis);
	property.put("user2","user");
	property.put("Password", "234554");
	FileOutputStream fos=new FileOutputStream("./src/main/resources/data.properties");
	property.store(fos, "updated Successfully");
}
}
