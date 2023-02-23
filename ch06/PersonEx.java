package ch06;

public class PersonEx {
	public static void main(String[] args) {
		Person ps1 = new Person();
		//ps1.name = "하니"; Person class의 변수 접근제어가 private이므로 외부 클래스에서 접근 불가
		ps1.setName("하니");
		System.out.println("이름 : " +ps1.getName());
		//System.out.println("이름 : " + name);// Person class의 변수 접근제어가 private이므로 외부 클래스에서 접근 불가
		ps1.setAge(-112);
		System.out.println("나이 " + ps1.getAge());
		ps1.setAge(11);
		ps1.print();
		// 로제 26, 보검 29
		
		Person ps2 = new Person(); 	ps2.setName("로제"); 	ps2.setAge(26); ps2.print();
		Person ps3 = new Person(); 	ps3.setName("보검"); 	ps3.setAge(29); ps3.print();
		
	
		
	}

}
