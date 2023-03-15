package NewAssignment;

public class UTwentyOne {
	

	public static void main(String[] args) {
		int a = 56;
		int b = 29;
		int c = 79;
		
		if (a > b && a > c) {
			System.out.println("largest number "+a);
		}else if (a > b && a < c) {
			System.out.println("middle number "+a);
		}else {
			System.out.println("smallest number "+a);
			
		}
		 if (b > c && b > a) {
				System.out.println("largest number "+b);
			}else if (b > c && b < a) {
				System.out.println("middle number "+b);
			}else {
				System.out.println("smallest number "+b);
				
			}
		 if (c > a && c > b) {
				System.out.println("largest number "+c);
			}else if (c > a && c < b) {
				System.out.println("middle number "+c);
			}else {
				System.out.println("smallest number "+c);
				
			}
		}

	}


