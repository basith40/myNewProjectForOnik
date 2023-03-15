import java.util.Scanner;

public class KEleven {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.println("input a month number");
		int month = my.nextInt();
		System.out.println("input a year");
		int year = my.nextInt();
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			System.out.println("February "+year+ " has 29 days");
		}else {
			System.out.println("February "+year+ " has 28 days");
		}

	}

}
