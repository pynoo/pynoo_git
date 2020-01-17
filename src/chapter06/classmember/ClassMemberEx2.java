package chapter06.classmember;

public class ClassMemberEx2 {
	int instanceVar;
	
	static int classVar;
	
	void instancemethod() {
		System.out.println(classVar);
	}
	//인스턴스메소드에 클래스 변수가 들어가는 것이 가능
	//클래스는 고정적이라 어디에 쓰일 수 있음
	
	static void classmethod() {
	//	System.out.println(instanceVar);
	}
	//스태틱메소드에 인스턴스변수 불가
	//스태틱메소드가 고정적인데 인스턴스는 고정적이지가 않아서
	
}
