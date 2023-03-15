package JuneHomeWorkPart2;

import java.util.Scanner;

public class HReverse {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("Input String Data : ");
		char[] words = myScanner.nextLine().toCharArray();
		System.out.print("Reverse String : ");
		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i]);
		}
		

	}

}
