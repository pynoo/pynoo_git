package chapter09;

public class AppEx2 {
	public static void main(String[] args) {
		AClass o = new AClass() {
			void m1() {
				System.out.println("AClass 하위 클래스 method");
			}
		};
		o.m1();
		
	}
}
