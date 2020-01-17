package chapter06;

public class MethodEx2 {
	void method1(){
		System.out.println("메소드1 시작");
		
		System.out.println("메소드1 끝");
	}
	
	void method2(int a){
		System.out.println("메소드2 시작");
		System.out.println("받은 값 : " + a);
		System.out.println("메소드2 끝");
	}
	
	void method2(int a, int b){
		System.out.println("메소드2 시작");
		System.out.println("받은 값 : " + a);
		System.out.println("받은 값 : " + b);
		System.out.println("메소드2 끝");
	}
}
