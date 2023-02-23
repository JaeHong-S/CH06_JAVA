package ch06;

class School {

	public static void main(String[] arg){
		Student4 s = new Student4();
		Teacher t = new Teacher();
		Manager m = new Manager();
		
		s.printAll();
		s.setName("소녀시대");
		s.setAge(19);
		s.setSno(5421563);
		
		s.printAll();
		t.printAll();
		m.printAll();
	}
}
