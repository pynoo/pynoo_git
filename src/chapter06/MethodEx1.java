package chapter06;

public class MethodEx1 {
	public static void main(String[] args) {
		method1();
		method2(99);
		method2(15);
		method3(15,15);
		int a = method4();
		System.out.println(a);
		double b = method5(26);
		System.out.println(b);
	}
	
	public static void method1() {
		System.out.println("method1 실행");
	}
	//public은 기능 -> 나중에 설명함
	//void란 타입이 없다는 의미의 타입
	public static void method2(int a) {
		System.out.println(a);
	}
	
	public static void method3(int a, int b) {
		System.out.println(a+ "," + b);
	}
	
	public static int method4() {
		return 3;
	}
	
	public static double method5(int line) {
		return 3.14*2.0*line;
	}
	
}
