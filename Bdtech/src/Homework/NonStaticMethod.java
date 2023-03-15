package Homework;

public class NonStaticMethod {
	
	public static void main(String[] args) {
		NonStaticMethod adding = new NonStaticMethod();
		adding.add(12, 15);
		adding.sub(12, 15);
		
		
	}
	public void add(int a , int b) {
		System.out.println(a+b);
	}
	public void sub(int a, int b) {
		System.out.println(b-a);
		
	}
 

}
