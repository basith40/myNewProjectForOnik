package JuneHomeWork;

import java.util.Scanner;

public class LEmployee {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("input the emp_id ");
		int id = myScanner.nextInt();
		System.out.println("input the emp_name ");
		String name = myScanner.next();
		System.out.println("input the salary ");
		double salary = myScanner.nextDouble();
		System.out.println("Your gross Salary is "+salary);

	}

}
