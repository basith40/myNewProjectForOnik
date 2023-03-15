package JuneHomeWorkPart2;


public class IChacactersCount {

	public static void main(String[] args) {
		String  characters = "Aa kiu, I swd skieo 236585. GH kiu: sieo?? 25.33";
		count(characters);

	}
	public static void count(String a) {
		char[]cha = a.toCharArray();
		int letter = 0;
		int space = 0;
		int number = 0;
		int others = 0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isLetter(cha[i])) {
				letter++;
			}
			else if (Character.isSpace(cha[i])) {
				space++;
			}
			else if (Character.isDigit(cha[i])) {
				number++;
		
			}
			else {
				others++;
			}
		}
		System.out.println("The String is : Aa kiu, I swd skieo 236585. GH kiu: sieo?? 25.33");
		System.out.println("letter : "+letter);
		System.out.println("Space : "+space);
		System.out.println("Number : "+number);
		System.out.println("Others : "+others);
		
	}

}
