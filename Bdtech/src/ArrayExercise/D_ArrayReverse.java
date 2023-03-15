package ArrayExercise;

import java.util.Arrays;
import java.util.Scanner;

public class D_ArrayReverse {

	public static void main(String[] args) {
		int [] numbers = {12,23,34,73,9,35};
		System.out.println("The origanal numbers arrays : ");
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		System.out.println("The reverse numbers arrays : ");
		for (int i = numbers.length-1; i >= 0; i--) {
			System.out.print(numbers[i]+" ");
		}
	}

}
