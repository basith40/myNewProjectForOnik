package InterFaceClass;

public class Cow extends Animal implements Pat{

	@Override
	public void food() {
		System.out.println("only Grass");
		
	}

	@Override
	public void jump() {
		System.out.println("i can not jump");
		
	}

}
