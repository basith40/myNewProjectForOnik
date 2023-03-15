package bdTuch.excelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataTest {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("//Users//chowdhury//Downloads//Book1.xlsx");
		XSSFWorkbook book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheetAt(0);
		String valu = sheet.getRow(1).getCell(5).getStringCellValue();
		System.out.println(valu);
		

	}

}
