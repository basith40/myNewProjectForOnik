package JuneHomeWork;


public class JOddNumberAdd {

	public static void main(String[] args) {
		int i = 1, add = 0;
		for ( i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println("The divided number is "+i);
				add += i;
			}
			
		}
		System.out.println("The adding number is "+add);

	}

}
