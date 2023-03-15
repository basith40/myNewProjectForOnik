package Homework;

public class StaticAndNonStatic {

	public static void main(String[] args) {
		show("Program is amazing");
		StaticAndNonStatic ba = new StaticAndNonStatic(); 
		ba.showing("Java is awesome");
		
		

	}
	public static void show(String a) {
		System.out.println(a);
	}
	public void showing(String b) {
		System.out.println(b);
		
	}

}
