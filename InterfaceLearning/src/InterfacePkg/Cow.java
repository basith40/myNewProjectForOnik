package InterfacePkg;

public class Cow extends Animals implements Pat{

	@Override
	public void play() {
		System.out.println("not playing");
		
	}

	@Override
	public void friendly() {
		System.out.println("yes i am");
		
	}

}
