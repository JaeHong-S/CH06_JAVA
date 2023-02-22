package ch06;

public class Method2 {
	static void cal(int x, int y) {
		System.out.printf("%d + %d = %d\n", x, y, x+y);
		System.out.printf("%d * %d = %d\n", x, y, x*y);
	}
	
	static void cal(double x, double y) { // 메소드 명이 같아도, 매게변수가 다르다면 괜찮다, 변수명은 중요하지 않다. 데이터형이 중요함
		System.out.printf("%f + %f = %f\n", x, y, x+y);
		System.out.printf("%f * %f = %f\n", x, y, x*y);
	}
	public static void main(String[] args) {
		
		for( int i = 0; i < 10; i++) {
			int x = (int)(Math.random() * 10) + 1;
			int y = (int)(Math.random() * 10) + 1;
			Method2.cal(x, y); //사용하려는 클래스명과 main으로 실행하는 클래스명이 일치할 때는 클래스명 생략가능 ex) Method2.cal => cal
			double a = Math.random() * 10;
			double b = Math.random() * 10;
			cal(a, b); // 전달되는 것은 변수명이 아닌 값
		}
		
	}

}
