package JuneHomeWorkPart2;

public class DSwap {

	public static void main(String[] args) {
		int a = 40;
		int b = 50;
		System.out.println("Befour Swap The number a = "+a+", b = "+b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After Swap The number a = "+a+", b = "+b);

	}

}
