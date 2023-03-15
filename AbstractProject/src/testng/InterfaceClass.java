package testng;

import InterfacePackage.InterFace2;
import InterfacePackage.InterFace3;
import InterfacePackage.InterFace4;
import InterfacePackage.Interface1;

public class InterfaceClass implements Interface1, InterFace2, InterFace3, InterFace4 {

	public static void main(String[] args) {
		InterfaceClass my = new InterfaceClass();
		my.muti();

		System.out.println(my.name());

	}

	@Override
	public void muti() {
		int a = 34;
		int b = 20;
		int c = a * b;
		System.out.println(c);

	}

	@Override
	public String name() {
		String name = "abdul chowdhury";
		return name;
	}

	@Override
	public int number() {

		return 0;
	}

	@Override
	public void masage() {

	}

}
