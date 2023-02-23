package ch06;

public class Student1 {
	String name;
	int kor; 
	int eng;
	int math;
	public Student1() {} //기본생성자
	public Student1(String n, int k, int e, int m) { //매개변수가 있는 생성자
		name = n; kor = k; eng = e; math = m;
	}
	int getTot() {
		return kor + eng + math;
	}
	
	float getAvg() {
		return getTot() / (float)3;
	}
	
}
