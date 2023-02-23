package ch06;
class E1{
	int add(int x, int y) {
		return x + y;
	}
//	int add(int a, int b) {return a + b;} 같은 메소드명이지만, 변수 타입이 같으므로 오류
	double add(double x, double y) {return x + y;} //같은 메소드 명이면서, 변수 타입이 달라서 괜찮음 = 오버로딩
	
	String add(String name) {return "안녕하세요 " + name + "님!";} //같은 메소드 명이면서, 변수 타입이 달라서 괜찮음 = 오버로딩 

}
public class OverLoading1 {
	public static void main(String[] args) {
		E1 e = new E1();
		System.out.println(e.add("철수")); // 오버로딩
		System.out.println(e.add(12, 67)); //원본 메소드
		System.out.println(e.add(3.14, 6.23)); // 오버로딩
	}

}
