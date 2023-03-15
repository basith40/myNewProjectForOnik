package NewAssignment;

import java.util.Scanner;

public class Zthirtytwo {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.print("input deposit amount : ");
		double deposit = my.nextDouble();
		System.out.print("input interest rate : ");
		double interest = my.nextDouble();
		interest = deposit*(interest/100);
		System.out.print("input income tax : ");
		double tax = my.nextDouble();
		tax = interest*(tax/100);
		double totalEarn = tax;
		System.out.println("person earns in a year :"+ totalEarn);


	}

}
