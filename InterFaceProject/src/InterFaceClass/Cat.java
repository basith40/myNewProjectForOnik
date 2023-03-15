package InterFaceClass;

public class Cat extends Tiger  implements Pat{

	@Override
	public void food() {
		System.out.println("Fish and Meet");
		
	}

	@Override
	public void jump() {
		System.out.println("I can Jump");
		
	}

}
