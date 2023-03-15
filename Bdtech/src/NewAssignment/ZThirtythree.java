package NewAssignment;

import java.util.Scanner;

public class ZThirtythree {

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.print("input employee no 1 salary : ");
		int salary = myScanner.nextInt();
		System.out.print("intput employee no 1 working age : ");
		int workingAge = myScanner.nextInt();
		if (workingAge >= 5) {
			System.out.println("employee salary is : "+((salary*.05)+salary));
		}
		else {
			System.out.println("employee salary is : "+salary);
		}
		
		

	}

}
