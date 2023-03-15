package NewComposition;

public class Honda {
	private String color;
	private int carWeight;
	private int mYear;
	private Engine engine;
	
	public Honda(String color, int carWeight, int mYear) {
		
		this.color = color;
		this.carWeight = carWeight;
		this.mYear = mYear;
		engine = new Engine();
		engine.setName("turbo");
		engine.setOilcapacity(18);
		
	}
	public int getEngineOilCapacity() {
		return engine.getOilcapacity();
	}
	public String getEngineName() {
		return engine.getName();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getCarWeight() {
		return carWeight;
	}
	public void setCarWeight(int carWeight) {
		this.carWeight = carWeight;
	}
	public int getmYear() {
		return mYear;
	}
	public void setmYear(int mYear) {
		this.mYear = mYear;
	}

}
