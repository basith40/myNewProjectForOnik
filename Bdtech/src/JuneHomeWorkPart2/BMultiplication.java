package JuneHomeWorkPart2;

import java.util.Scanner;

public class BMultiplication {

	public static void main(String[] args) {
		int i,j;
		Scanner my = new Scanner(System.in);
		System.out.println("input the number ");
		j = my.nextInt();
		for ( i = 0; i <=j; i++) {
			System.out.println(i+" x "+j+" = "+j*i);
		}
	}

}
