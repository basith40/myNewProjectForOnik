package IOStreamsPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		File file = new File("src/MyFile.txt ");
		try (FileWriter fileWriter = new FileWriter(file)){
			fileWriter.write("i love new york ..");
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		FileReader fileReader = new FileReader(file);
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String line = null;
		while ((line = bufferedReader.readLine())!= null) {
			System.out.println(line);
			
		}

	}

}
