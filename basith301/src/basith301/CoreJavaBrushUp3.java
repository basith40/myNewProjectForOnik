package basith301;

public class CoreJavaBrushUp3 {

	public static void main(String[] args) {
		String myName = "Abdul Basith Chowdhury";
		String wifeName = new String("Shamima Akther Shammi");
		String [] nameSplit = myName.split("Basith");
		System.out.println(nameSplit[0]);
		System.out.println(nameSplit[1]);
		//System.out.println(nameSplit[2]);
		System.out.println(nameSplit[1].trim());
		for(int i = 0; i< wifeName.length(); i++) {
			System.out.println(wifeName.charAt(i));
		}
		System.out.println("&&&&&&&&&&&&&&&&&&&");
		for(int i = wifeName.length()-1; i >= 0; i--) {
			System.out.println(wifeName.charAt(i));
			
		}

	}

}
