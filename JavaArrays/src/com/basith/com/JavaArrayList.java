package com.basith.com;

import java.util.ArrayList;

public class JavaArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> math = new ArrayList<>();
		math.add(34);
		math.add(12);
		math.add(50);
		math.add(65);
		math.remove(2);
		
		for(int add : math) {
			System.out.println(add);
		}
	
	}

}
