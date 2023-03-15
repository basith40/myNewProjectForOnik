package NewAssignment;

import java.util.Scanner;

public class Ltwelve {

	public static void main(String[] args) {
		Scanner my  = new Scanner(System.in);
		System.out.println("input the emp_id");
		int id = my.nextInt();
		System.out.println("input the name");
		String name = my.next();
		System.out.println("input basic salary");
		double salary = my.nextDouble();
		System.out.println("your gross salary is = "+salary);

	}

}
