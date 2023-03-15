import java.util.Scanner;

public class MThirteen {
	//3. Write a Java program that takes a year from user and
	//print whether that year is a leap year or not. 

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("in put year ");
		
		int year = myScanner.nextInt();
		
		if (year % 4 == 0 && year % 100 !=0 || year % 400 == 0) {
			System.out.println("is leapyear "+year);
			
		}else {
			System.out.println("is not leapyear "+year);
		}
		

	}

}
