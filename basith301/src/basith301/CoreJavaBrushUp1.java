package basith301;

public class CoreJavaBrushUp1 {

	public static void main(String[] args) {
		int myNumber = 48;
		String myName = "Abdul Basith Chowdhury";
		char myNum = '1';
		double dec = 8.9;
		boolean shammi = true;
		System.out.println("my age is "+myNumber);
		//Arrays
		int [] hasi = new int[3];
		hasi [0] = 35;
		hasi [1] = 45;
		hasi [2] = 55;
		int [] hasi1 = {89,79,39};
		//System.out.println(hasi1[1]);
		//for loop
		for(int i = 0; i< hasi.length; i++) {
			//System.out.println(hasi[i]);
		}
		//Enhanced for loop
		for(int to : hasi) {
			System.out.println(to);
		}
		for(int i = 0; i< hasi1.length; i++) {
			//System.out.println(hasi1[i]);
		}
		for(int ru : hasi1){
			System.out.println(ru);
		}
		String[] name = {"Basith","Shammi","Mahira","Mahima","Mehrab","Maisha"};
		for(int i = 0; i <name.length; i++) {
			//System.out.println(name[i]);
		}
		for(String na : name) {
			System.out.println(na);
		}

	}

}
