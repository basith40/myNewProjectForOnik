package JuneHomeWork;

public class PStudents {
	public String first_name;
	public String last_name;
	public int age;

	public static void main(String[] args) {
		PStudents students = new PStudents();
		students.first_name = "Abdul";
		students.last_name = "chowdhury";
		students.age = 47;
		System.out.println("Student 1 : "+students.first_name+" "+students.last_name+". "+students.age);
		students.first_name = "Shamima";
		students.last_name = "Shammi";
		students.age = 39;
		System.out.println("Student 2 : "+students.first_name+" "+students.last_name+". "+students.age);
		students.first_name = "Mahira";
		students.last_name = "Chowdhury";
		students.age = 19;
		System.out.println("Student 3 : "+students.first_name+" "+students.last_name+". "+students.age);
		students.first_name = "Mahima";
		students.last_name = "Chowdhury";
		students.age = 16;
		System.out.println("Student 4 : "+students.first_name+" "+students.last_name+". "+students.age);
		students.first_name = "Mehrab";
		students.last_name = "chowdhury";
		students.age = 11;
		System.out.println("Student 5 : "+students.first_name+" "+students.last_name+". "+students.age);
		
	}
	

}
