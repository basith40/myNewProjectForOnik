package JuneHomeWork;

import java.util.Scanner;

public class SRevenue {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("input the unit price : ");
		double unitPrice = myScanner.nextDouble();
		System.out.print("input the quantity : ");
		int quqntity = myScanner.nextInt();
		double purchasedPrice = (unitPrice * quqntity);
		 
		if (quqntity >= 100 && quqntity <=120) {
			System.out.println("You get 10% discount : "+(purchasedPrice-(purchasedPrice * 0.1)));
		}
		else if (quqntity > 120) {
			System.out.println("You get 15% discount : "+(purchasedPrice-(purchasedPrice * 0.15)));
		}
		else {
			System.out.println("You dont have discount");
		}

	}

}
