package NewAssignment;

public class PSixteen {
	
	String firstName;
	String lastName;
	int age;
	
	public PSixteen(String first, String last, int age1) {
		firstName = first;
		lastName = last;
		age = age1;
		System.out.println(first+" "+last+","+age1);
				
	}

	public static void main(String[] args) {
		
	PSixteen my1 = new PSixteen("basith", "chy", 48);
	PSixteen my2 = new PSixteen("hasan", "ahmed", 42);
	PSixteen my3 = new PSixteen("tisha", "chowdhury", 20);
	PSixteen my4 = new PSixteen("shammi", "chowdhury", 39 );
	PSixteen my5 = new PSixteen("maisha", "chowdhury", 15);
		

	}

}
