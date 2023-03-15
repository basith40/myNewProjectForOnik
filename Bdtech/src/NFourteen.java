
public class NFourteen {
	//14. Write a program in Java to input 5 numbers from 
	//keyboard and find their sum and average. 

	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			
			System.out.println(i);
		}
		int a = 1;
		int b = 2;
		int c = 3;
		int d = 4;
		int e = 5;
		int sum = a + b + c + d + e;
		System.out.println("the sum is "+sum);
		int avg = (a + b + c + d + e) / 5;
		System.out.println("the average "+avg);

	}

}
