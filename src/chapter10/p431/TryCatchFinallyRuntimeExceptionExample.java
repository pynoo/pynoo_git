package chapter10.p431;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
//		String d1 = null; //data
//		String d2 = null;

//		try {
//			d1 = args[0];
//			d2=args[1];
//		} catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("실행 매개값의 수가 부족합니다.");
//			System.out.println("[실행방법]");
//			System.out.println("java TryCatchFinallyRuntimeExceptionExample");
//			System.out.println("num1 num2");
//			return;
//		}
		try {
		m1();
		} catch(NumberFormatException t){
			System.out.println("숫자로 변환 X");
		}
	}
		


	private static void m1() throws NumberFormatException {
		String d1 = null; //data
		String d2 = null;
//		try {
			int v1 =Integer.parseInt(d1);
			int v2 =Integer.parseInt(d2);
			int r = v1 + v2;
			System.out.println(r);
			
//		}catch(NumberFormatException e) {
//			System.out.println("숫자로 변환할 수 없습니다.");
			
//		} finally{
//			System.out.println("다시 실행");
//		}
			
			
	}
}

