import java.util.Scanner;
//5.    Write a Java program to print the sum (addition), multiply, subtract, divide and remainder 
//of two numbers.  Test Data: Input first number: 125 Input second number: 24
//
public class Efive {
	 //static int a = 125;
	 //static int b = 24;

	public static void main(String[] args) {
		Scanner multi = new Scanner(System.in);
		System.out.println("input first number ");
		int firstNumber = multi.nextInt();
		System.out.println("input second number ");
		int secondNumber = multi.nextInt();
		System.out.println(firstNumber +" + "+secondNumber+ " = "+(firstNumber + secondNumber));
		System.out.println(firstNumber +" - "+secondNumber+ " = "+(firstNumber - secondNumber));
		System.out.println(firstNumber +" x "+secondNumber+ " = "+(firstNumber * secondNumber));
		System.out.println(firstNumber +" / "+secondNumber+ " = "+(firstNumber / secondNumber));
		System.out.println(firstNumber +" % "+secondNumber+ " = "+(firstNumber % secondNumber));



		/*int add = a + b;
		System.out.println(add);
		int sub = a - b;
		System.out.println(sub);
		int multiply = a * b;
		System.out.println(multiply);
		int divide = a / b;
		System.out.println(divide);
		int mod = a % b;
		System.out.println(mod);*/
			
		

	}

}
