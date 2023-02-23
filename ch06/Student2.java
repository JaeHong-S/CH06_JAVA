package ch06;

public class Student2 {
	String name; int kor; int eng; int math;
	
	
	public Student2(String name, int kor, int eng, int math) {
		this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	}

	int getTot() {
		return kor + eng + math;
	}
	
	int getAvg() {
		
		return getTot()/3;
	}
	
	void prn() {
		System.out.println("--------------");
		System.out.println("이름 : " + name );
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + getTot());
		System.out.println("평균 : " + getAvg());
		
	}
}
