package IOStreamsPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoLearn {

	public static void main(String[] args) throws IOException {
		File myFile = new File("src/taxt.txt");
		try (FileWriter myWriter = new FileWriter(myFile)){
			myWriter.write("This is new for me ");
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader myReader = new FileReader(myFile);
		BufferedReader bReader = new BufferedReader(myReader);
		String taxt = null;
		while ((taxt = bReader.readLine())!= null) {
			System.out.println(taxt);
		}
//        byte data[] = new byte[20];
//		System.out.print("input data : ");
//	    System.in.read(data);
//		System.out.print("You write : ");
//		for (int i = 0; i < data.length; i++) {
//			System.out.print((char)data[i]);
//		}
//		File file = new File("src/basith.txt");
//		try(FileInputStream myStream = new FileInputStream(file)) {
//			System.out.println("my file size :"+myStream.available());
//			int name;
//			while ((name = myStream.read())!= -1) {
//				System.out.print((char)name);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//			
//		}
//		
//		FileReader my = new FileReader(file);
//		BufferedReader ny = new BufferedReader(my);
//		String taxt = null;
//		while ((taxt = ny.readLine())!= null) {
//			System.out.println(taxt);
//		}
		

	}

}
