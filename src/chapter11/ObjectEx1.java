package chapter11;

public class ObjectEx1 {
	public static void main(String[] args) {
		MyClass s1 = new MyClass();
		
		s1.setI(100);
		s1.setN("안나");
		
		String r1 = s1.toString();
		
		System.out.println(r1);
		System.out.println(s1);
	}
}
