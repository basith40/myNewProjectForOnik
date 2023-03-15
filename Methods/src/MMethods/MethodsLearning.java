package MMethods;

public class MethodsLearning {

	public static void main(String[] args) {
	    java();
	    java1("Good", "Morning");
	    java2(12, 30, "sum is");
	    double gross = salary(3000.90, 200.89)*.10;
	    System.out.println(gross);

	}
	public static double salary(double a, double b) {
		return a + b;
	}
	public static void java2(int c, int r, String n) {
		System.out.println(c+r+" = "+n);
	}
	public static void java1(String a, String b) {
		System.out.println(a+" "+b);
	}
	
	
	public static void java() {
		System.out.println("helo World");
	}

}
