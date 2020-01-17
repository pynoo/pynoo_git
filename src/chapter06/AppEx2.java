package chapter06;

public class AppEx2 {
	public static void main(String[] args) {
		
		User x = new User();
		System.out.println(x.id);
		System.out.println(x.lv);
		
		User y = new User("computer");
		System.out.println(y.id);
		System.out.println(y.lv);
		
		User z = new User("java",99);
		System.out.println(z.id);
		System.out.println(z.lv);
		
		
		
		ConstructorEx1 ce1 = new ConstructorEx1(5);
		ConstructorEx1 ce2 = new ConstructorEx1(7);
		
		ConstructorEx1 ce3 = new ConstructorEx1();
		ConstructorEx1 ce4 = new ConstructorEx1(8, 9);
		
	}
}