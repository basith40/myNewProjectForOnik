import java.util.Scanner;

public class JTen {

	public static void main(String[] args) {
		Scanner my = new Scanner(System.in);
		System.out.println("in put number 1 ");
		int number1 = my.nextInt();
		System.out.println("in out number 2 ");
		int number2 = my.nextInt();
		System.out.println("in put number 3 ");
		int number3 = my.nextInt();
		if (number1 > number2) {
			System.out.println("greatest "+number1);
		}else if (number2 > number3) {
			System.out.println("greatest "+number2);
		}else {
			System.out.println("greatest "+number3);
		}
			
		
	

	}

}
