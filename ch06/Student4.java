package ch06;

public class Student4 {
	private String name = "Jin Sil";
	private int age = 20;
	private int sno = 123456;
	
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

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}
	void printAll() {
		System.out.println("-----------");
		System.out.println(name);
		System.out.println(age);
		System.out.println(sno);
	}
	
	
	
}
