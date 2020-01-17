package chapter06;

public class MethodEx4 {
	//메소드 오버로딩
	// 메소드의 이름은 같지만 
	//파라미터 타입의 조합이 다르면
	//다른 메소드가 됨
	//리턴 타입과는 관계 없음!!!!!
	
//	int method() {
//		return 1;
//	}
	
	
	void method() {
		System.out.println("메소드1 실행");
		System.out.println("파라미터 : 없음");
	}
	
	void method(int a) {
		System.out.println("메소드1 실행");
		System.out.println("파라미터 : int");
	}
	
	void method(int a, int b) {
		System.out.println("메소드1 실행");
		System.out.println("파라미터 : int int");
	}
	
	void method(int a ,String b) {
		System.out.println("메소드1 실행");
		System.out.println("파라미터 : int String");
	}
	
	void method(String a, int b) {
		System.out.println("메소드1 실행");
		System.out.println("파라미터 : String int");
	}
}
