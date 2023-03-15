package com.basith.com;

import java.util.Arrays;

public class ArraysClass {

	public static void main(String[] args) {
		String [] friends = {"jabir", "shahab", "tuhin", "mony"};
		Arrays.sort(friends);
		for(String my : friends) {
			System.out.println(my);
		}
		

	}

}
