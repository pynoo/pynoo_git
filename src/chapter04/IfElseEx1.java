package chapter04;

import java.util.Scanner;

public class IfElseEx1 {
	public static void main(String[] args) {
		int x = 15, i = 0;
		Scanner a = new Scanner(System.in);
		Scanner b = new Scanner(System.in);

		for (i = 0; i < 10; i++) {

			System.out.print("나이는 :");
			String s = a.nextLine();

			x = Integer.parseInt(s);
			System.out.println(x);

			if (x >= 20) {
				System.out.println("어른입니다.");
			} else if (i >= 8) {
				System.out.println("학생입니다.");
			} else
				System.out.println("아이입니다.");
		}

		a.close();
		b.close();
	}
}
