package GenericUtility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {
	public String getDataFromExcel(String sheetname,int rownum,int celnum) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./testdata/Book1.xlsx");
		Workbook b=WorkbookFactory.create(fis);
		String data=b.getSheet(sheetname).getRow(rownum).getCell(celnum).toString();
		return data;
		
	}

}
