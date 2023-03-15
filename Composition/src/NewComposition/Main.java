package NewComposition;

public class Main {

	public static void main(String[] args) {
		Car myCar = new Car("honda", 5);
		Honda myHonda = new Honda("black",670, 2016);
		
		myHonda.setColor("red");
		System.out.println(myHonda.getColor()+", "+myHonda.getEngineName());
		System.out.println(myHonda.getmYear());
		

	}

}
