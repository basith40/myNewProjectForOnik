package com.basithenterprise;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExceldataTest {
	

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("/Users/basith301/Downloads/Book1.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		int sheets = workbook.getNumberOfSheets();
		for(int i = 0; i<sheets; i++) {
			if (workbook.getSheetName(i).equalsIgnoreCase("Test1")) {
				XSSFSheet sheet = workbook.getSheetAt(i);
				Iterator<Row>row = sheet.iterator();
				@SuppressWarnings("unused")
				Row firstRow = row.next();
				@SuppressWarnings("unused")
				Row secendRow = row.next();
			}
		}

	}

}
