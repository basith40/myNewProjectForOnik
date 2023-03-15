package InterfacePkg;

public class Cat extends Tiger implements Pat{

	@Override
	public void play() {
		System.out.println("alowes play");
		
	}

	@Override
	public void friendly() {
		System.out.println("Not for everybody");
		
	}
	

}
