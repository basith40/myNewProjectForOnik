package NewAssignment;

import java.util.Scanner;

public class ZThirty {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.print("input quantity = ");
		int quantity = my.nextInt();
		System.out.print("input unit price = ");
		int unitPrice = my.nextInt();
		System.out.println("total sale price is = "+(quantity * unitPrice));

	}

}
