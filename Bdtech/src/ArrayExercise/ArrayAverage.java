package ArrayExercise;

public class ArrayAverage {

	public static void main(String[] args) {
		int [] numbers = {98, 23, 109, 35, 78, 12};
		int addition = 0;
		for (int i = 0; i < numbers.length; i++) 
			addition = addition + numbers[i];
		double average = addition / numbers.length;
		System.out.println("The average of Array is : "+average);
		
	}

}
