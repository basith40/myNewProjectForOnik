package NewAssignment;

import java.util.Scanner;

public class ZTwentynine {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.print("input number = ");
		int number = my.nextInt();
		if (number % 2 == 0) {
			System.out.println("Its even number");
		}
		else {
			System.out.println("Its odd number");
		}

	}

}
