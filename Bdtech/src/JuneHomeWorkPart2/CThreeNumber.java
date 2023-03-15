package JuneHomeWorkPart2;

import java.util.Scanner;

public class CThreeNumber {

	public static void main(String[] args) {
		int a, b, c;
		Scanner my = new Scanner(System.in);
		System.out.println("Input the first number : ");
		a = my.nextInt();
		System.out.println("Input the second number : ");
		b = my.nextInt();
		System.out.println("Input the third numbet : ");
		c = my.nextInt();
		int add = (a+b+c);
		System.out.println("The sum of three is : "+add);
		double average = add / 3;
		System.out.println("The average is : "+average);
		
		
		

	}

}
