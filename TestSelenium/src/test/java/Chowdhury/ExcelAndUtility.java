package Chowdhury;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelAndUtility {
	public static final String PATH = "/Users/chowdhury/eclipse-workspace/TestSelenium/src/main/java/Utilities/TestUtilities.properties";

	public static String utility(String valuue) throws IOException {
		File utilityFile = new File(PATH);
		FileInputStream stream = new FileInputStream(utilityFile);
		Properties myProperties = new Properties();
		myProperties.load(stream);
		return myProperties.getProperty(valuue);
	}

	public static void main(String[] args) throws IOException {

		File xcealFile = new File("//Users/chowdhury//Downloads//Book1.xlsx");
		FileInputStream stream = new FileInputStream(xcealFile);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheetAt(0);
		String data = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println(data);

	}

	public static final String MYPATH = "";

	public static String utility1(String key) throws Exception {
		File myFile = new File(MYPATH);
		FileInputStream stream1 = new FileInputStream(myFile);
		Properties myprop = new Properties();
		myprop.load(stream1);
		return myprop.getProperty(key);

	}

	public static void exceldata() throws Exception {
		File exFile = new File("");
		FileInputStream sInputStream = new FileInputStream(exFile);
		XSSFWorkbook myBook = new XSSFWorkbook(sInputStream);
		XSSFSheet mySheet = myBook.getSheetAt(0);
		String nsheet = mySheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(nsheet);
	}

}
