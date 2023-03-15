package javaFirstClass;

public class First {

	public static void main(String[] args) {
		int number = 45;
		System.out.println("my age more then "+ number);
		String alpha = "Abdul Basith ChowDhury";
		char carectar = 't';
		double paramiter = 80.89;
		boolean decition = true;
		
		//Arrays;
		String [] famaly = {"Shammi","Basith","Mahira","Mahima","Mehrab","Maisha"};
		System.out.println(famaly[4]);
		for(String all : famaly) {
			System.out.println(all);
		}
		String [] myFamaly = new String [5];
		myFamaly [0] = "Jabir";
		myFamaly [1] = "Hasan";
		myFamaly [2] = "Sayeed";
		myFamaly [3] = "Urmi";
		myFamaly [4] = "Lota";
		System.out.println(myFamaly[2]);
		for(int i = 0; i <myFamaly.length; i++) {
			System.out.println(myFamaly[i]);
		}
		int []myNumber = {21,34,8,86,70,77,99};
		System.out.println(myNumber[5]);
		for(int allNum : myNumber) {
			System.out.println(allNum);
		}
		int []sum = new int[5];
		sum [0] = 75;
		sum [1] = 77;
		sum [2] = 45;
		sum [3] = 7;
		sum [4] = 35;
		for(int i = 0; i< sum.length; i++) {
			System.out.println(sum[i]);
		}
		System.out.println(sum[4]);
		

	}

}
