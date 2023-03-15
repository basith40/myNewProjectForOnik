package PolymorphismJava;

public class Cat extends Animal {
	private String name;
	private String color;
	private int lag;
	
	public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public String getColor() {
		return color;
	}
    public void setColor(String color) {
		this.color = color;
	}
    public int getLag() {
		return lag;
	}
    public void setLag(int lag) {
		this.lag = lag;
	}
	
	
	public void walk() {
		System.out.println("walk");
	}
	public void sound() {
		System.out.println("miwo");
	}
	
	
	
	
	

}
