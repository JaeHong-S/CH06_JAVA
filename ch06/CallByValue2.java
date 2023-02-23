package ch06;
class AB1{
	void m1(int a, int b) {// 전달한 것은 x = 10, y = 20
// a와 b 값을 서로 교환해서 출력

		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
public class CallByValue2 {
	public static void main(String[] args) {
		AB1 a1 = new AB1();
		int x = 10, y = 20;
		a1.m1(x, y);// 값 10, 20을 m1메소드에 넣은 값
		System.out.println("main a = " + x); // 그냥 main에서 선언한 int x, y 값
		System.out.println("main b = " + y);
	}
	

}


