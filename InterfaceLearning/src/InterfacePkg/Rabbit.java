package InterfacePkg;

public class Rabbit implements Pat{

	@Override
	public void play() {
		System.out.println("play in forest");
		
	}

	@Override
	public void friendly() {
		System.out.println("so friendly");
	}

}
