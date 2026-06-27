package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TolearnFetchingDataFromExcelsheet {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis= new FileInputStream("./Testdata/Testscriptdata.xlsx");
	Workbook wb=WorkbookFactory.create(fis);
	String value = wb.getSheet("Testscriptdata.xlsx").getRow(1).getCell(0).getStringCellValue();
	System.out.println(value);
}
}
