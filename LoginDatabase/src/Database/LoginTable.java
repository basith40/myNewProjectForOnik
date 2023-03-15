package Database;

import java.util.Scanner;

public class LoginTable {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("input age");
		int age = myScanner.nextInt();
		if (age >= 18) {
			System.out.println("you are voter");
		}
		else {
			System.out.println("you are not alowd to vote");
		}
	}
}
