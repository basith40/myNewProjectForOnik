package javaFirstClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Second {

	public static void main(String[] args) {
		String alpha = "Abdul Basith ChowDhury";
		String[] myN = alpha.split("Basith");
		for(String na : myN) {
			//System.out.println(na.trim());
		}
		for(int i = 0; i< alpha.length(); i++) {
			//System.out.println(alpha.charAt(i));
		}
		for(int i = alpha.length()-1; i>=0; i--) {
			System.out.println(alpha.charAt(i));
		}
			
		
		
		int []myNumber = {21,34,8,86,70,77,99};
		for(int ta : myNumber) {
			if(ta % 3 == 0) {
				//System.out.println(ta);
			}
			else {
				//System.out.println(ta+" not devided");
			}
		}
		//System.out.println("$$$$$$$$$$$$$$$$");
		for(int i = 0; i < myNumber.length; i++) {
			if(myNumber[i]% 2 == 0) {
				//System.out.println(myNumber[i]);
			}
		}
		ArrayList<String> road = new ArrayList<String>();
		road.add( "Glenmore Avenue");
		road.add("Eldert Lane");
		road.add("Forball Street");
		road.add("Liberty Avenue");
		//System.out.println(road.get(2));
		for(int i = 0; i< road.size(); i++) {
			//System.out.println(road.get(i));
		}
		for(String address : road) {
			//System.out.println(address);
		}
		
			//System.out.println(road.contains("Eldert Lane"));
			String [] famaly = {"Shammi","Basith","Mahira","Mahima","Mehrab","Maisha"};
			List <String> own = Arrays.asList(famaly);


	}

}
