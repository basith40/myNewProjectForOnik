package PolymorphismJava;

public class CarMain {

	public static void main(String[] args) {
		ShowRoom myShowRoom = new ShowRoom();
		Honda myCar = new Honda();
		Toyota myToyota = new Toyota();
		myShowRoom.allCar(myCar);
		myShowRoom.allCar(myToyota);
		

	}

}
