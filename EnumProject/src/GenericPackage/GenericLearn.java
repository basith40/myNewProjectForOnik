package GenericPackage;
class exam<T>{
	private T bangla;
	private T english;
	public exam(T bangla, T english) {
		this.bangla = bangla;
		this.english = english;
	}
	public T getBangla() {
		return bangla;
	}
	public void setBangla(T bangla) {
		this.bangla = bangla;
	}
	public T getEnglish() {
		return english;
	}
	public void setEnglish(T english) {
		this.english = english;
	}
	
}

public class GenericLearn {

	public static void main(String[] args) {
		exam<Integer>myExam = new exam(89, 90);
		System.out.println(myExam.getBangla());
		exam<String>myExam2 = new exam(56, 78);
		try {
			System.out.println(myExam2.getEnglish());
		} catch (Exception e) {
			System.out.println("masege "+e);
			
		}
		
		

	}

}
