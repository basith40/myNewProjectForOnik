package ArrayExercise;

public class C_ArraySpecificValue {

	public static void main(String[] args) {
		int [] numbers = {12, 87, 10, 97, 89};
		for(int myNumber : numbers) {
		if (myNumber == 10) {
			System.out.println("My specific Value is : "+myNumber);
		}
		}
	}

}
