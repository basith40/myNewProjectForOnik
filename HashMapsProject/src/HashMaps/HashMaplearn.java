package HashMaps;

import java.util.HashMap;

public class HashMaplearn {

	public static void main(String[] args) {
		HashMap<String, Integer> user = new HashMap<>();
		user.put("basith", 47);
		user.put("shammi", 89);
		System.out.println(user.entrySet());
	}

}
