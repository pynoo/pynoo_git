package chapter02;

public class PrimitiveType {
	public static void main(String[] args) {
		// 정수형 - byte, short, int, long
		// byte -> 범위 : -128~127
		// short -> 범위 : -32768~32767
		// int -> 범위 : -2147483648~2147483647
		// long -> 범위 : -9223372036854775808~9223372036854775807

		// 실수형 - float, double
		// float -> 범위 : 1.4E-45~3.4028235E38
		// double -> 범위 : 4.9E-324~1.7976931348623157E308

		// 문자형 - char

		// 논리형 - boolean
		System.out.println("Byte형의 범위");
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		byte x = -128;
		System.out.println(x);
		x = 127;
		System.out.println(x);

		System.out.println("Short형의 범위");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);

		System.out.println("int형의 범위");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);

		System.out.println("long형의 범위");
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);

		System.out.println(7770000000L);
		// L을 쓰는 이유는 int의 범위보다 크면 레터럴하게 표현하기가 힘들어서 사용

		// float
		System.out.println("float형의 범위");
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);

		float floatX = 3.14F;
		System.out.println(floatX);
		// F를 쓰는 이유는 double의 범위보다 클경우 F를 사용??? 다시 질문

		// double
		System.out.println("double형의 범위");
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);

		double doubleX = 3.14;
		System.out.println(doubleX);

		// char
		System.out.println("char형의 범위");
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);

		char charX = 'a'; // 무조건 하나를 넣어야함
		System.out.println(charX);
		charX = 66;
		System.out.println(charX);

		//boolean
		System.out.println("boolean형의 범위");
		boolean booleanX = true;
		booleanX = false;
		
	}
}
