package chapter10.p426;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String d1 = "100";
		String d2 = "a100";
		
		int v1 = Integer.parseInt(d1);
		int v2 = Integer.parseInt(d2);
		
		int r = v1 + v2;
		System.out.println(d1 + "+" + d2 + "=" + r);
	}
}
