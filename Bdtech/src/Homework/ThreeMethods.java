package Homework;

public class ThreeMethods {
	public int a = 30;
	public int b = 40;
	public int c = 50;
	
	public ThreeMethods() {
		int value1 = a;
        int value2 = b;
        int value3 = c;
		System.out.println(value1+value2+value3);
		
	}
	public ThreeMethods(int a, int b, int c) {
	    int value4 = a;
		int value5 = b;
		int value6 = c;
		System.out.println(value6-value5-value4);
	}
	public ThreeMethods(int a, int b ) {
		int value7 = a;
		int value8 = b;
		int value9 = c;
		System.out.println(value7*value8-value9);
	}

	public static void main(String[] args) {
		ThreeMethods one = new ThreeMethods();
		ThreeMethods two = new ThreeMethods(30,40,50);
		ThreeMethods three = new ThreeMethods(30,40);
		
		
	}

}
