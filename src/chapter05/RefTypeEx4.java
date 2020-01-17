package chapter05;

public class RefTypeEx4 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		
		System.out.println(a == b);

		int[] aArr = {2, 3};
		int[] bArr = {2, 3};
		
		System.out.println(aArr == bArr);
		
		System.out.println(aArr[0] == bArr[0]);
		
	}
}
