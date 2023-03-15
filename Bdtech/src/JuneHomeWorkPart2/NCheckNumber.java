package JuneHomeWorkPart2;

import java.util.Scanner;

public class NCheckNumber {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("input the number : ");
		int number = myScanner.nextInt();
		
			if (number % 2 == 0 ) {
				System.out.println("1");
			}
			else {
				System.out.println("0");
			}
		
	}

}
