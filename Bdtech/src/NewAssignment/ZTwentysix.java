package NewAssignment;
import java.util.Arrays;
public class ZTwentysix {

	public static void main(String[] args) {
		int [] a = {23, 44, 49, 20, 33, 90};
		int [] b = {12, 70, 33, 52, 23, 66};
		System.out.println("array a is : "+Arrays.toString(a));
		System.out.println("array b is : "+Arrays.toString(b));
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println("common integer number is : "+a[i]);
				}
			}
		}
	}

}
