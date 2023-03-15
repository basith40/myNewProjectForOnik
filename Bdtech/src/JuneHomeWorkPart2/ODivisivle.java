package JuneHomeWorkPart2;

public class ODivisivle {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("Divided by 3 and 5 : "+i);
			}	
			else if(i % 3 == 0) {
				System.out.println("Divided by 3 : "+i);
			}
			else if (i % 5 == 0) {
				System.out.println("Divided by 5 : "+i);
			
			}
		}

	}

}
