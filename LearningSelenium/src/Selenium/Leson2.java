package Selenium;

public class Leson2 {
	private int emp_id;
	private String emp_name;
	private double basicSalary;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public static void main(String[] args) {
		Leson2 myLeson2 = new Leson2();
		myLeson2.setEmp_id(38);
		myLeson2.setEmp_name("Mohammed Ali");
		myLeson2.setBasicSalary(4999.10);
		System.out.println(myLeson2.getEmp_id()+"\n"+myLeson2.getEmp_name()+"\n"+myLeson2.salary());
	
	}
	public  double salary() {
		double grossSalary = (basicSalary*.10)+basicSalary;
		return grossSalary;
	}
}
