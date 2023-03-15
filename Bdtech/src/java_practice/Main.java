package java_practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
   public static void main(String[] args) {
	   File file = new File("src/number.txt");
	   try(FileWriter fileWriter = new FileWriter(file)) {
		fileWriter.write("My Name is Abdul Chowdhury");
		fileWriter.close();
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String show = null;
		while ((show = bufferedReader.readLine())!= null) {
			System.out.println(show);
		}
	} catch (IOException e) {
		// TODO: handle exception
	}
//	   try (FileInputStream fileInputStream = new FileInputStream(file)){
//		System.out.println("show "+fileInputStream.available());
//		int dis;
//		while ((dis = fileInputStream.read())!= -1) {
//			System.out.print((char)dis);
//		}
//	} catch (IOException e) {
//		// TODO: handle exception
//	}
	
	}
	
}		
	
	
		

		
		

	
