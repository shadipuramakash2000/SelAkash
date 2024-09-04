package unit3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFomExcelMethodChaining {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=  new FileInputStream("./src/test/resources/Book1auto.xlsx");
	Workbook wb= WorkbookFactory.create(fis);
	double data = wb.getSheet("Sheet1").getRow(2).getCell(1).getNumericCellValue();
	System.out.println(data);
	wb.close();
}
}

