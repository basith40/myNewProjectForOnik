import java.util.Scanner;

public class DFour {
	//4.     Write a Java program that takes two 
	//numbers as input and display the product of two numbers. 

	public static void main(String[] args) {
		Scanner multiply = new Scanner(System.in);
		System.out.println("input first number =");
		int firstNumber = multiply.nextInt();
		System.out.println("input second number =");
		int secondNumber = multiply.nextInt();
		System.out.println("result ="+(firstNumber * secondNumber));
		/*int a, b;
		a = 25;
		b = 5;
		int result = a * b;
		System.out.println(result);*/

	}

}
