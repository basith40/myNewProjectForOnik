package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class JavaMap {

	

	public static void main(String[] args) {
		HashMap<Integer, String> phoneBook = new HashMap<>();
		phoneBook.put(89, "Shammi");
		phoneBook.put(87, "Basith");
		phoneBook.put(56, "mahira");
		System.out.println(phoneBook.get(38));
		
		//System.out.println(phoneBook.getOrDefault(56, "Mehrab"));
		phoneBook.replace(56, "Mehrab");
        System.out.println(phoneBook.entrySet());
        if (phoneBook.containsValue("Basith")) {
			System.out.println("i am hare");
		}
        else {
			System.out.println("Nope");
		}
        TreeMap<Integer, String> office = new TreeMap<>();
        office.put(78, "Tahir Ahamed");
        office.put(231, "Shaila azim");
        office.put(23, "Jakir hussain");
        System.out.println(office.entrySet());
        
	}

}
