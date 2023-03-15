package bdtuch.ExcelData;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelDetaTest {
	@Test

	public  void excetTest() throws IOException {
		File file = new  File("//Users/chowdhury//Downloads//Bug Report.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String valueString = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(valueString);

	}

}
