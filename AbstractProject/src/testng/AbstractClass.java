package testng;

import AbstractPackage.Abstract1;

public class AbstractClass extends Abstract1 {

	public static void main(String[] args) {
		AbstractClass my = new AbstractClass();
		my.area(60, 70);
		System.out.println(my.math());

	}

	@Override
	public void name() {

	}

	@Override
	public int math() {
		int a = 10;
		int b = 20;
		int c = 2;
		int result = a * b / c;
		return (result);
	}

	@Override
	public void area(double width, double langth) {
		double total = width * langth;
		System.out.println(total);

	}

}
