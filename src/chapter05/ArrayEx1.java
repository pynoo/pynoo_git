package chapter05;

public class ArrayEx1 {
	public static void main(String[] args) {
		int x =1; //intVar1
		String a ="경자"; // strVar1
		
		//배열탑입 변수명 = {값1, 값2 ...};
		int[] y= {1, -2, 0}; // intArrayVar1
		String[] b = {"merry", "new"}; // strArrayVar1
		
		//배열의 길이만
		int[] z = new int[5];
		z[2] = 9;
		System.out.println(z[0]); // 값을 안 정해주면 기본값이 나옴 -> int는 0
		System.out.println(z[2]);
		
		for (int i=0; i<z.length;i++) {
			System.out.println(z[i]);
		}
		
		
		//배열의 길이를 변경할 수 없다.
		y[0]=5;
		y[1]=9;
		y[2]=15;
		//y[3]=5; 원래의 길이이상의 값을 넣으면 에러가 남
		
		System.out.println(y[0]);
		System.out.println(y[1]);
		System.out.println(y[2]);
	}
}
