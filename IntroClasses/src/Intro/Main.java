package Intro;

public class Main {

	public static void main(String[] args) {
		Ball myBall =new Ball("black", "coocer", 30);
		myBall.showColor();
		myBall.showName();
		myBall.showBounceRate();
		myBall.setColor("red");
		System.out.println(myBall.getColor());
		
		}

}
