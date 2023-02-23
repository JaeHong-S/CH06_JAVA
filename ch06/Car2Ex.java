package ch06;
class Car2{
	public Car2() { 
//		this() 같은 클래스 내의 다른 생성자를 호출
		this("벤츠"); // public Car2(String kind) 호출
		System.out.println("매개변수가 없는 생성자");
	}

	public Car2(String kind) { //this() 해당 생성자 내에 첫째줄에 있어야함
		this("벤츠", "노랑");// public Car2(String kind, String color) 호출
		System.out.println("매개변수가 1개인 생성자" +" " + kind);
	}

	public Car2(String kind, String color) {
		System.out.println("매개변수가 2개인 생성자" + " " + kind+ ", "+color);
	}
}
public class Car2Ex {
	public static void main(String[] args) {
		//Car2 c1 = new Car2("BMW", "빨강");
		Car2 c09 = new Car2();
		 
		
	}
}
