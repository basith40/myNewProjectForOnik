import java.util.Scanner;

public class OFifteen {
	

	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("in put number ");
		int number = myScanner.nextInt();
		for(int i = 0 ; i <= 5; i++) {
			System.out.println(number + " X "+i+ " = "+(number * i));
		}

	}

}
