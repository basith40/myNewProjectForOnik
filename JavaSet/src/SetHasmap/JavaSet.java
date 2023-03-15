package SetHasmap;

import java.util.HashSet;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {
		Set<Integer> myNumber = new HashSet<>();
		myNumber.add(100);
		myNumber.add(101);
		myNumber.add(102);
		myNumber.add(103);
		myNumber.add(104);
		for(int a : myNumber) {
			System.out.println(a);
		}
		

	}

}
