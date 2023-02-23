package ch06;

public class Student3 {
	String name;
	int kor;
	int eng;
	int math;

	public Student3(String name) {
		this(name, 60);
		System.out.println("매개변수 1개");
	}

	public Student3(String name, int kor) {
		this(name, kor, 60 );
		System.out.println("매개변수 2개");

	}

	public Student3(String name, int kor, int eng) {
		this(name, kor, eng, 60);
		System.out.println("매개변수 3개");
	}

	public Student3(String name, int kor, int eng, int math) {
		System.out.println("매개변수 4개");
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("-------------");
	}
	public static void main(String[] args) {
		Student3 s1 = new Student3("재홍");
	
		
	}

}
