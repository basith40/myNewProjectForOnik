import java.util.Scanner;
//6.    Write a Java program that takes a number as input and prints its 
//multiplication table upto 10.  

public class FSix {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.println("input the number ");
		int number = my.nextInt();
		for(int i = 0; i < 10; i++) {
			System.out.println(number+ " X " +(i+1)+ " = " +(number * (i + 1)));
		}
		
	}

}
