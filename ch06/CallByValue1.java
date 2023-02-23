package ch06;
class AA1{
	void m1(int x, int y) {// 전달한 것은 x = 10, y = 20
		x += 7;
		y += 5;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
public class CallByValue1 {
	public static void main(String[] args) {
		AA1 a1 = new AA1();
		int x = 10, y = 20;
		a1.m1(x, y);// 값 10, 20을 m1메소드에 넣은 값
		System.out.println("main x = " + x); // 그냥 main에서 선언한 int x, y 값
		System.out.println("main y = " + y);
	}
	

}
