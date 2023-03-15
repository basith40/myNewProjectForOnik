package NewAssignment;

public class MThirteen extends MThirteen1{

	public static void main(String[] args) {
		MThirteen my = new MThirteen();
		my.setEmp_id(234);
		my.setEmp_name("hasan ahmed");
		my.setBasicSalary(8000.00);
		double salary = my.getBasicSalary();
		double bonus = salary*.1;
		double gross = salary + bonus;
		System.out.println(gross);
		
		

	}

}
