package JuneHomeWork;

public class NEncapsulation extends NEncapsulationSub{

	public static void main(String[] args) {
		NEncapsulation my = new NEncapsulation();
		my.setUserName("Basith30");
		my.setPassword("Maisha207@");
		my.setEmail("basith301@yahoo.com");
		my.setFistAndLastName("Abdul Chowdhury");
		System.out.println("User Name : "+my.getUserName()+"\n"+"Password : "+my.getPassword()+"\n"+"Email : "+my.getEmail()+"\n"+"First and Last name : "+my.getFistAndLastName());

	}

}
