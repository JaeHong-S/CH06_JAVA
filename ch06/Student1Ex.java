package ch06;

public class Student1Ex {
	public static void main(String[] args) {
//		홍길동 100, 60, 76
		Student1 st1 = new Student1(); //기본 생성자 --> 값을 초기화 해줘야함
		st1.name = "홍길동";
		st1.kor = 100; st1.eng = 60; st1.math = 76;
		System.out.println("이름 : " + st1.name);
		System.out.println("총점 : " + st1.getTot());
		System.out.println("평균 : " + st1.getAvg());
		
		System.out.println("======================");
		
		Student1 st2 = new Student1("홍길동", 100, 60, 76); //--> 바로 인자를 넣어서 객체 생성
		System.out.println("이름 : " + st2.name);
		System.out.println("총점 : " + st2.getTot());
		System.out.println("평균 : " + st2.getAvg());
		
	}

}
