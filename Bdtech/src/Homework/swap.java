package Homework;

public class swap {

	public static void main(String[] args) {
		//Swap two numbers in Java and display in screen.
		int a , b;
		a = 10;
		b = 20;
		
		System.out.println("befour swapping a =" +a+ " b = " +b);
		a = b+a;
		b = a-b;
		a = a-b;
		System.out.println("afte swapping a =" +a+ " b = " +b);
		

	}

}
