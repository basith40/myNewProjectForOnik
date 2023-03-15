package ArrayExercise;

import java.util.Arrays;

public class B_ArraysSort {

	public static void main(String[] args) {
		int [] numbers = {109, 88, 206, 75, 34, 78};
		String [] name = {"Basith", "Nazrul", "Hasan", "Matheur", "Jannath"};
		
		System.out.println("Numbers Arrays befour sorting : "+Arrays.toString(numbers));
	    Arrays.sort(numbers);
	    System.out.println("Numbers Arrays after sorting : "+Arrays.toString(numbers));
	    
	    System.out.println("Name Arrays befour sorting : "+Arrays.toString(name));
	    Arrays.sort(name);
	    System.out.println("Name Arrays after sorting : "+Arrays.toString(name));

	}

}
