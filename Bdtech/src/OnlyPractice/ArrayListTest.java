package OnlyPractice;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String>nameOfMyFamily = new ArrayList<>();
		nameOfMyFamily.add("Abdul Basith Chowdhury");
		nameOfMyFamily.add("Shamima Akther Shammi");
		nameOfMyFamily.add("Mahira Chowdhury");
		nameOfMyFamily.add("Mahima Chowdhury");
		nameOfMyFamily.add("Mehrab Chowdhury");
		nameOfMyFamily.add("Maisha Chowdhury");
		for (String string : nameOfMyFamily) {
			System.out.println(string);
		}
		int english = 89;
		Integer marks = new Integer(english);
		System.out.println(marks);
		int recover = marks.intValue();
		System.out.println(recover);
		double salary = 7800.90;
		Double name = new Double(salary);
		double resalary = name.doubleValue();
		char mine = 't';
		Character myCharacter = new Character(mine);
		char recovery = myCharacter.charValue();
		System.out.println(recovery);

	}

}
