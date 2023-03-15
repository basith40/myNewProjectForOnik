package NewAssignment;

import java.util.Scanner;

public class ZThirtyone {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.print("enter unit price : ");
		int unitPrice = my.nextInt();
		System.out.print("enter quantity : ");
		int quantity = my.nextInt();
		if (quantity >= 100 && quantity <= 120 ) {
			System.out.println("discount 10% : "+(unitPrice * quantity * .10));
		}
		else if (quantity > 120) {
			System.out.println("discount 15% : "+(unitPrice * quantity * .15));
		}

	}

}
