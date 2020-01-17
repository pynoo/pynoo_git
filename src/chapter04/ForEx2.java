package chapter04;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("몇 단? : ");
		String input = a.nextLine();
		int x = Integer.parseInt(input);
		
		for (int i = x; i >1; i--) {
			System.out.println(i + "단");
			for (int j = 9; j >=1; j--) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
			System.out.println(" ");
		}
		a.close();
	}
}
