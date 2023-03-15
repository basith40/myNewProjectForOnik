package OnlyPractice;

public class OuterAndInner {
	
	private String name;
	private int salary;
	public void gross() {
		new inner().totalsalary();
		new Other().income();
	}
	class inner{
		public void totalsalary() {
			name = "hasan";
			salary = 3000;
			System.out.println(name+ " " +salary);
			
		}
		
	}
	class Other{
		public void income() {
			name = "bantg";
			salary = 4000;
			System.out.println(name+ " " +salary);
		}
	}

	public static void main(String[] args) {
		OuterAndInner my = new OuterAndInner();
		my.gross();
		my.income();
		

	}

	private void income() {
		// TODO Auto-generated method stub
		
	}
	

}
