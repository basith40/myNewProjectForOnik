package NewAssignment;

public class Students {
	String firstName;
	String lastName;
	int age;

	public static void main(String[] args) {
		Students ny = new Students();
		ny.firstName = "Abdul";
		ny.lastName = "Chowdhury";
		ny.age = 47;
		System.out.println(ny.firstName+" "+ny.lastName+" "+ny.age);
		ny.firstName = "Shammi";
		ny.lastName = "Chowdhury";
		ny.age = 39;
		System.out.println(ny.firstName+" "+ny.lastName+" "+ny.age);
	}

}
