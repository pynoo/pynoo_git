package chapter03;

public class Arithmetic {
	public static void main(String[] args) {
		// + - * / % ++ --
		
		int  x = 10;
		int  y = 30;
		
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		System.out.println(x % y);
		x++;
		System.out.println(x);
		y--;
		System.out.println(y);
		
		//다른 타입과 연산하는 경우
		int a = 50;
		double b = 3.14;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		
		//연산시 주의할점
		// overflow
		
		int c =2100000000;
		int d =2100000000;
		int e = c + d;
		System.out.println(c+d);
		System.out.println(e);
		
		long longx = c + d;
		System.out.println(longx);
		//롱 타입을 넣어도 인트로 계산해서 오버플로우가 일어남
		//계산할 때 롱 타입을 넣어 주어야 함
		long longy = (long)c+d;
		System.out.println(longy);
	}
}
