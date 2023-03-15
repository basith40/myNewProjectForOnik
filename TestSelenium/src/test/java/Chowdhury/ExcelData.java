package Chowdhury;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws IOException {
		File eFile = new File("//Users/chowdhury//Downloads//Book1.xlsx");
		FileInputStream stream = new FileInputStream(eFile);
		XSSFWorkbook workbook = new XSSFWorkbook(stream);
		XSSFSheet sheet = workbook.getSheetAt(0);
		String data = sheet.getRow(1).getCell(4).getStringCellValue();
		System.out.println(data);

	}
}
