package ch06;
class Car{
	String kind;
	int displacement;
	String color;
	public Car(String kind, int displacement, String color){
		this.kind = kind; this.displacement = displacement; this.color = color; // 2. 메인에서 넣은 인자들을 클래스 변수에 대입
	}
	void print() {
		System.out.println("=============");
		System.out.println("종류 : " + kind); // 클래스 변수 출력
		System.out.println("배기량 : " + displacement);
		System.out.println("종류 : " + color);
	}
}
public class CarEx {
	public static void main(String[] args) {
		Car car1 = new Car("소나타", 1500, "빨강");//1. 인자들은 Car의 인자값으로 들어감
		Car car2 = new Car("벤츠", 2000, "노랑");
		Car car3 = new Car("BMW", 2500, "파랑");
		car1.print(); car2.print(); car3.print();
	}

}
