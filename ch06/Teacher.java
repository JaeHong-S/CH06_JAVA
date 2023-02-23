package ch06;

public class Teacher {
	private String name = "박선생";
	private int age = 89;
	private String subject = "파이썬";
	
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	void printAll() {
		System.out.println("-----------");
		System.out.println(name);
		System.out.println(age);
		System.out.println(subject);
	}
	

}
