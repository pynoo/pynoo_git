package chapter10.p434;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String d1=args[0];
			String d2=args[1];

			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			
			int r =v1 + v2;
			System.out.println(d1+"+"+d2+"="+r);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java CatchByExceptionKindExample");
			System.out.println("num1 num2");
		} catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행");
		}
	}
}
