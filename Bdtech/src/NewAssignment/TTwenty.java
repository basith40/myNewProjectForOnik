package NewAssignment;

public class TTwenty {

	public static void main(String[] args) {
		TTwenty my = new TTwenty();
		my.chase(.08);
		my.city(.07);
		my.td(.09);

	}
	public void chase(double interest) {
		System.out.println("Chase interest "+interest);
	}
	public void city(double interest) {
		System.out.println("City interest "+interest);
	}
	public void td(double interest) {
		System.out.println("TD interest "+interest);
	}

}
