package MyPrectice;
class Name{
	public String name;
	public int age;
}
class Bank <T>{
	private T name;
	private T age;
	
	public Bank(T name, T age) {
		this.name = name;
		this.age = age;
	}
	
	
	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
	public T getAge() {
		return age;
	}
	public void setAge(T age) {
		this.age = age;
	}
	
}



public class Practice {
	public static void main(String[]args) {
		Bank<String>bank = new Bank("abdul", "chowdhury");
		System.out.println(bank.getName());
		Name name = new Name();
		name.name = "shammi";
		name.age = 39;
		Bank<Name>bou = new Bank(name, name);
		System.out.println(bou.getAge().age);
		
		
	}

	

}
