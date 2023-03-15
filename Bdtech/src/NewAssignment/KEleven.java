package NewAssignment;

public class KEleven {

	public static void main(String[] args) {
		int i ;
		
		for(i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("DingDong ");
				}
			else if (i % 5 == 0) {
				System.out.println("Dong ");
			} else if (i % 3 == 0) {
				System.out.println("Ding");
			}else {
				System.out.println(i);
			} 
				
		}
				
	}	

}
