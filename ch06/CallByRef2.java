package ch06;
class C2{
	int x, y;
	
	public void m1(C2 c) {
//		x와 y를 서로 교환하고 c.x, c.y를 출력
		
		int tmp;
		tmp = x;
		x = y;
		y = tmp;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
public class CallByRef2 {
	public static void main(String[] args) {
//		C2 c를 생성하여 c.x = 10, c.y = 20을 대입하고 m1()메서드에 c를 전달
		C2 c = new C2();
		c.x = 10;
		c.y = 20;
		c.m1(c);
		System.out.println("c.x = " + c.x);
		System.out.println("c.y = " + c.y);
	}

}
