package ArrayExercise;

import java.util.Arrays;

public class F_SHighestValue {

	public static void main(String[] args) {
		int [] numbers = {24,87,45,12,97,89};
		int highestNumber = numbers[0];
		int sHighestNumber = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > highestNumber) {
				sHighestNumber = highestNumber;
				highestNumber = numbers[i];
				
			}
			else if(numbers[i] > sHighestNumber){
				sHighestNumber = numbers[i];
			}
		}
		System.out.println(sHighestNumber);
	}

}
