package JuneHomeWork;

public class OOverloadedConstructor {

	public static void main(String[] args) {
		OOverloadedConstructor my = new OOverloadedConstructor(432, "Hasan Jabir");
		OOverloadedConstructor my1 = new OOverloadedConstructor(456, "Shamima Shammi");

	}
	public OOverloadedConstructor(int id, String name) {
		System.out.println("language id : "+id+ "\n programming name : "+name );
	}

}
