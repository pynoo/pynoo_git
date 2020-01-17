package chapter06.classmember;

public class ClassMemberEx1 {
	//인스턴스 변수, 인스턴스 필드
	int instanceVar1;
	
	//클래스 변수, 클래스 필드
	//스태틱 변수, 스태틱 필드
	static int classVar1; 
	
	void instanceMethod() {
		System.out.println("정보 : " + this.instanceVar1);
	}
	
	//클래스 메소드, 스태틱메소드
	static void classMethod() {
		System.out.println("정보 : " + classVar1);
	}
}
