package OnlyPractice;

public abstract class Bank {
	private String name;
	private String location;
	private int branch;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getBranch() {
		return branch;
	}
	public void setBranch(int branch) {
		this.branch = branch;
	}
	public abstract void onlineBanking();
	public abstract void atm();
	public abstract void craditCard();
	public void loan() {
		System.out.println("all instituit ");
	}

}
