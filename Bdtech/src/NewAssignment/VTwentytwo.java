package NewAssignment;

import OnlyPractice.PayPal;

public class VTwentytwo {
	int English = 76;
	int biology = 82;
	int math = 89;
	int histry = 92;
	int ela = 72;
	
	public void add() {
		int totalMarks = (English+biology+math+histry+ela);
		System.out.println("total Marks is : "+totalMarks);
	}
	public void avg() {
		int avgMarks = ((English+biology+math+histry+ela)/5);
		System.out.println("avg marks si : "+avgMarks);
	}
	public static void main(String[] args) {
		VTwentytwo my = new VTwentytwo();
		my.add();
		my.avg();
		
	}

}
