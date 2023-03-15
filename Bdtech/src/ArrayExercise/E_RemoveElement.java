package ArrayExercise;

import java.util.Arrays;

public class E_RemoveElement {

	public static void main(String[] args) {
		int [] numbers = {98,45,99,23,36,78};
		System.out.println("The origanal numbers arrays : "+Arrays.toString(numbers));
		int removeIndex = 3;
		for (int i = removeIndex; i < numbers.length - 1; i++) {
			numbers[i] = numbers[i + 1];
		}
		System.out.println("The numbers arrays now : "+Arrays.toString(numbers));

	}

}
