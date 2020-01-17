package chapter05;

public class RefTypeEx3 {
	public static void main(String[] args) {
		int[] a = {3, 2, 6};
		
		int[][] na = {{2, 3}, {99, 98}, {-1, 3}};
		
		System.out.println(na.length);
		System.out.println(na[0].length);
		System.out.println(na[1].length);
		System.out.println(na[2].length);
		
		System.out.println("---------------");
		System.out.println(na[0][0]);
		System.out.println(na[0][1]);
		
		System.out.println(na[1][0]);
		System.out.println(na[1][1]);
		
		System.out.println(na[2][0]);
		System.out.println(na[2][1]);
		
		na[1] = a;
		
		System.out.println(na[1][1]);
	}
}






