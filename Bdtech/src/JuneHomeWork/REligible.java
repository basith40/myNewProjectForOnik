package JuneHomeWork;

import java.util.Scanner;

public class REligible {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("input the age : ");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("You are eligible for vote.");
		}
		else {
			System.out.println("Sorry you are not eligible for vote.");
		}

	}

}
