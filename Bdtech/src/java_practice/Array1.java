package java_practice;

public class Array1 {

	public static void main(String[] args) {
		int [] myArray = {25,2,100,89,39,44,25,100};
		int total = 0;
		for (int i = 0; i < myArray.length; i++) {
			total += myArray[i];
		}
		System.out.println("the adding number is : "+total);

	}

}
