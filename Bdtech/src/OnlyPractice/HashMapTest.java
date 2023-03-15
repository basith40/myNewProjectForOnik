package OnlyPractice;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String>employees = new HashMap<>();
		String number = employees.put(101, "Mark twen");
		employees.put(120, "darc hanry");
		employees.put(139, "pit boll");
		employees.put(177, "git hav");
		HashMap<Integer, String>employeeNew = new HashMap<>(employees);
		HashMap<Integer,String>employees2 = new HashMap<>();
		employees2.put(23, "mita nur");
		employees2.put(78, "ahad ali");
		employees2.put(67, "bathir ahmed");
		employeeNew.putAll(employees2);
		System.out.println(employeeNew);
		System.out.println(employees.get(139));
		

	}

}
