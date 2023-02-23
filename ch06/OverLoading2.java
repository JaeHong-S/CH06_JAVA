package ch06;
class Box{
	int volume(int x, int y, int z) {
		return x * y * z;
	}
	double volume(double x, double y, double z) {
		return x * y* z;
	}
}
public class OverLoading2 {
	public static void main(String[] args) {
		Box v = new Box();
		System.out.println(v.volume(12, 15, 20));
		System.out.println(v.volume(12.7, 5.6, 7.4));
		System.out.println(v.volume(15.2, 5, 20)); //실수 와 정수가 섞여있다면, 실수의 범위가 더 넓기 때문에 실수 타입으로 계산
	}
}
