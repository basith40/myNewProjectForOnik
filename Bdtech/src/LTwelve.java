import java.util.Scanner;

public class LTwelve {


	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("inter a character");
		String alphabet = myScanner.next().toLowerCase();
		boolean uppercase = alphabet.charAt(0) >= 65 && alphabet.charAt(0) <= 90;
		boolean lowercase = alphabet.charAt(0) >= 97 && alphabet.charAt(0) <= 122;
		boolean vowel = alphabet.equals("a") || alphabet.equals("e") || alphabet.equals("i") || alphabet.equals("o") || alphabet.equals("u");
		if (alphabet.length()>1) {
			System.out.println("error. nao a single character");
		}else if (!(uppercase || lowercase)) {
			System.out.println("error. not a letter. Enter uppercase or lawercase ");
		}else if (vowel) {
			System.out.println("its a vowel");
		}else {
			System.out.println("its a consonant");
		}

	}

}
