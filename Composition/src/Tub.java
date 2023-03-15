
public class Tub {
	private int size;
	private Bubble b;
	
	public Tub(int size) {
		this.size = size;
		b = new Bubble();
		b.setColor("pink");
		b.setRedius(34);
	}
	public int getBubleredius() {
		return b.getRedius();
	}
	
	public String getBubleColor() {
		return b.getColor();
		
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	

}
