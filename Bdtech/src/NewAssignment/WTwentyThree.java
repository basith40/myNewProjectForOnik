package NewAssignment;

public class WTwentyThree {
	
    public static void main(String[] args) {
		WTwentyThree employee = new WTwentyThree();
		employee.employee("abdul chowdhury", 48, 5000, "1133 glenmore ave brooklyn ny11208");
		employee.employee("shamima shammi", 39, 2000, "1133 glenmore ave brooklyn ny 11208");
		employee.employee("jabir hussain", 49, 5500, "78 nostand blbd long island ny 23123");
		employee.employee("kabin", 40, 6000, "897 janshan ave hilside ny 11543");
		employee.employee("parul ahmed ", 52, 3500, "461 eldert lane brooklyn ny 11208");

	}
	public void employee(String name, int age, double salary, String address) {
		System.out.println(name+"\nage " +age+"\nsalary " +salary+"\n" +address);
	}

}
