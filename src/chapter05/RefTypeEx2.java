package chapter05;

public class RefTypeEx2 {
	public static void main(String[] args) {
		// 기본 타입
		int a = 0;
		int b = 3;
		
		a = b;
		
		System.out.println(a);
		
		// 참조 타입
		int[] aArr = new int[3];
		int[] bArr = new int[4];
		
		bArr[3] = 98;
		
		aArr = bArr;
		
		System.out.println(aArr[3]);
		
	}
}

