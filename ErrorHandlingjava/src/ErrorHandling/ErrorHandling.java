package ErrorHandling;



public class ErrorHandling {

	public static void main(String[] args) {
		int sum = 0;
		for(String argumant : args) {
			try {
				sum = sum + Integer.parseInt(argumant);
			} catch (NumberFormatException e) {
				
				System.out.println(argumant+ "its not a number");
			}
			System.out.println("sum is : "+sum);
		}
	
	}

}
