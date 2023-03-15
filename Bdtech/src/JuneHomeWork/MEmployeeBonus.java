package JuneHomeWork;

public class MEmployeeBonus extends MEmployeeSub{

	public static void main(String[] args) {
		MEmployeeBonus my = new MEmployeeBonus();
		my.setEmp_id(234);
		my.setEmp_name("Abdul Chowdhury");
		my.setBasicSalary(5800.00);
		double salary = my.getBasicSalary();
		double bouns = salary*.1;
		double grossSalary = salary+bouns;
		System.out.println(my.getEmp_id()+"\n"+my.getEmp_name()+"\n"+my.getBasicSalary());
		System.out.println("The gross salary is "+grossSalary);
		

	}

}
