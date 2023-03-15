package Intro;

public class Ball {
	private String color;
	private String name;
	private int bouncerate;
	
	public Ball() {
		
	}
	public Ball (String ccolor, String nname, int bbouncerate) {
		color = ccolor;
		name = nname;
		bouncerate = bbouncerate;
	}
	public void showBounceRate() {
		System.out.println(bouncerate);
	}
	public void showName() {
		System.out.println(name);
	}
	public void showColor() {
		System.out.println(color);
	}
	public void bounce() {
		System.out.println("bouncing");
	
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBouncerate() {
		return bouncerate;
	}

	public void setBouncerate(int bouncerate) {
		this.bouncerate = bouncerate;
	}

	
	

}
