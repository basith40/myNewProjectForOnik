package java_practice;

public class Computer extends Software {
	private String name;
	private int stroage;
	private String oSystem;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStroage() {
		return stroage;
	}
	public void setStroage(int stroage) {
		this.stroage = stroage;
	}
	public String getoSystem() {
		return oSystem;
	}
	public void setoSystem(String oSystem) {
		this.oSystem = oSystem;
	}
	@Override
	public void vm() {
		System.out.println("very first VM");
		
	}
	@Override
	public void java() {
		System.out.println("java is best ");
		
	}
	

}
