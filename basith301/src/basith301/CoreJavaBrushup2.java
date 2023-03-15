package basith301;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		String [] address = new String[4];
		address [0] = "Glenmore";
		address [1] = "Eldert Lane";
		address [2] = "Pitkin";
		address [3] = "Grant";
		for(String add : address) {
			System.out.println(add);
		}
		int [] myNumbers = {2,8,77,31,12,56,19,};
		for(int i = 0; i<myNumbers.length; i++) {
			if(myNumbers[i] % 4 == 0) {
				System.out.println(myNumbers[i]);
				break;
			}
			else {
				System.out.println(myNumbers[i]+" not devide the numbers");
			}
		}
		ArrayList<String> name = new ArrayList<String>();
		name.add("Basith");
		name.add("Shammi");
		name.add("Mahira");
		name.add("Mahima");
		name.add("Mehrab");
		name.add("Maisha");
		name.remove(4);
		System.out.println(name);
		System.out.println(name.get(3));
		for(int i = 0; i<name.size(); i++) {
			System.out.println(name.get(i));
		}
		System.out.println("000000000000");
		for(String myNames : name) {
			System.out.println(myNames);
		}
		System.out.println(name.contains("Mahira"));
		String[] names = {"Basith","Shammi","Mahira","Mahima","Mehrab","Maisha"};
		List<String> allNames = Arrays.asList(names);
		System.out.println(allNames.contains("Maisha"));

	}

}
