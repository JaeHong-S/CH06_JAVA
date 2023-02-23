package ch06;

public class Manager {
	private String name = "성매니저";
	private int age = 99;
	private String part = "체육관";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	void printAll() {
		System.out.println("-----------");
		System.out.println(name);
		System.out.println(age);
		System.out.println(part);
	}
	
	
	

}
