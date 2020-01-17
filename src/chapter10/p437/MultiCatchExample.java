package chapter10.p437;

public class MultiCatchExample {
	public static void main(String[] args) {
		try {
			String d1=args[0];
			String d2=args[1];

			int v1 = Integer.parseInt(d1);
			int v2 = Integer.parseInt(d2);
			
			int r =v1 + v2;
			System.out.println(d1+"+"+d2+"="+r);
		} catch(ArrayIndexOutOfBoundsException |NumberFormatException e) {
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다.");
			
		} catch(Exception e) {
			System.out.println("알 수 없는 예외.");
		} finally {
			System.out.println("다시 실행");
		}
	}
}
