package InterfacePkg;

public class Main {

	public static void main(String[] args) {
		Cat myCat = new Cat();
		myCat.setFood("meet");
		System.out.println(myCat.getFood());
		myCat.friendly();
		myCat.play();

	}

}
