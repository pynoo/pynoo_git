package chapter05;

import java.util.Random;

public class ArrayEx3 {
	public static void main(String[] args) {
		Random a = new Random();
		int[] x = new int[6];
		
		int i = 0;
		while (i < x.length) {
			int newNumber = a.nextInt(45) + 1;
			
			int j = 0;
			while (j < i) {
				if (x[j] == newNumber) {
					break;
				}
				j++;
			}
			
			if (j == i) {
				x[i] = newNumber;
				i++;
			}
		}
		
		for (int number : x) {
			System.out.println(number);
		}
		
//		for (int i = 0; i < x.length; i++) {
//			x[i] = a.nextInt(45) + 1;
//			System.out.println(x[i]);
//		}

		// 향상된 for문
//		for (int y : x) {
//			System.out.println(y);
//		}
	}
}
