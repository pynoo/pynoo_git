package chapter10.p424;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
//		String d1 = args[0]; //data1
//		String d2 = args[1];
//		
//		System.out.println("args[0] : "+ d1);
//		System.out.println("args[1] : "+ d2);
		//예외처리가 뜸
		if(args.length >=2) {
			
		String d1 = args[0]; //data1
		String d2 = args[1];
		
		System.out.println("args[0] : "+ d1);
		System.out.println("args[1] : "+ d2);
		} else {
			System.out.println("실행방법");
			System.out.println("java Array ArrayIndexOutOfBoundsExceptionExample");
			System.out.println("값1 값2");
		}
	}
}
