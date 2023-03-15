package NewAssignment;

import java.util.Scanner;

public class REighteen {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.println("input age" );
		int age = my.nextInt();
		if (age >= 18) {
			System.out.println("the person is eligible to vote.");
		}
		else {
			System.out.println("You are not eligible to vote.");
		}

	}

}
