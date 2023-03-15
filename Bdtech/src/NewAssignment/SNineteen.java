package NewAssignment;

import java.util.Scanner;

public class SNineteen {

	public static void main(String[] args) {
		
		
		Scanner my = new Scanner(System.in);
		System.out.println("input the quantity");
		int quantity = my.nextInt();
		System.out.println("input the unitPrice");
		int unitPrice = my.nextInt();
		if (quantity >= 100 && quantity <= 120) {
			System.out.println("you get discount"+(unitPrice *quantity*0.1));
		}else if (quantity > 120) {
			System.out.println("you get discount"+(unitPrice * quantity * 0.15));
		}
		else {
			System.out.println("you get no discount");
		}

	}

}
