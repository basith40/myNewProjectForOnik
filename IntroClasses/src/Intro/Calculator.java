package Intro;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("input number =");
		double number1 = myScanner.nextDouble();
		System.out.println("input operator ; ");
		String op = myScanner.next();
		System.out.println("input other number ; ");
		double number2 = myScanner.nextDouble();
		if(op.equals("+")) {
			System.out.println(number1 + number2);
		}else if (op.equals("-")) {
			System.out.println(number1 - number2);
		}else if (op.equals("*")) {
			System.out.println(number1 * number2);
		}else if (op.equals("/")) {
			System.out.println(number1 / number2);
		}else if (op.equals("%")) {
			System.out.println(number1 % number2);
		}else {
			System.out.println("invalid number or sing");
		}

	}

}
