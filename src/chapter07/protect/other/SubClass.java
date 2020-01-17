package chapter07.protect.other;

import chapter07.protect.SuperClass;

public class SubClass extends SuperClass {
	public static void main(String[] args) {
	//	SuperClass s = new SuperClass();
		
	//pretected는 다른 패키지로 가면 사용불가
	//그러나 상속받으면 사용가능
	//	s.method();
	// default는 상속을 해도 사용불가	
	//	s.method2();
		
	}
	void method3() {
		
		super.method();
	}
}
