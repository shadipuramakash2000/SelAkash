package unit3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFromExcelUsingDataFormatter {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
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
}
}
