package NewAssignment;

public class NFourteen extends NFourteen1{

	public static void main(String[] args) {
		NFourteen user = new NFourteen();
		user.setFirstName("abdul");
		user.setLastName("chowdhury");
		user.setEmail("basith30@aol.com");
		user.setUserName("basith30");
		user.setPassword("301Njitjfj");
		System.out.println(user.getFirstName()+" "+user.getLastName()+" \n"+user.getEmail()+"\n"+user.getUserName()+"\n"+user.getPassword());

	}

}
