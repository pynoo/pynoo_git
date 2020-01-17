package chapter06;

public class AppEx3 {
	public static void main(String[] args) {
		MethodEx5 re2 = new MethodEx5();
		re2.method1(5);
		//System.out.println(r);
		
		System.out.println("----------------------------------------------------------------------");
		
		
		
		MethodEx3 re1 = new MethodEx3();
		int r = re1.method1();
		System.out.println(r);
		
		System.out.println("----------------------------------------------------------------------");
		
		double a = re1.method2();
		System.out.println(a);
		
		System.out.println("----------------------------------------------------------------------");
		
		MethodEx2 me1 = new MethodEx2();
		me1.method1();
		
		MethodEx2 me2 = new MethodEx2();
		me2.method1();
		me2.method2(876);
		me2.method2(846, 18);
	}
}
