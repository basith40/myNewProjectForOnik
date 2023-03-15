package NewAssignment;

public class Jten {

	public static void main(String[] args) {
		int i, add = 0;
		for(i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
				add += i;
			}
		
			}
		System.out.println("result "+add);

	}

}
