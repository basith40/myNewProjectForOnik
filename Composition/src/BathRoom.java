
public class BathRoom {
	private String color;
	
	private Tub t;
	
	public BathRoom(String color) {
		this.color = color;
		t = new Tub(0);
		t.setSize(45);
		
	}
	public int tabSize() {
		return t.getSize();
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}


}
