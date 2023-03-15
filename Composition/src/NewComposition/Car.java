package NewComposition;

public class Car {
	private String name;
	private int setcapacity;
	private Honda h;
	
	public Car(String name, int setcapacity) {
		this.name = name;
		this.setcapacity = setcapacity;
		h = new Honda(name, setcapacity, setcapacity);
		h.getCarWeight();
		h.getColor();
		h.getmYear();
	}
    public String getName() {
		return name;
	}
    public void setName(String name) {
		this.name = name;
	}
    public int getSetcapacity() {
		return setcapacity;
	}
    public void setSetcapacity(int setcapacity) {
		this.setcapacity = setcapacity;
	}
    

}
