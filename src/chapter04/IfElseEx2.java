package chapter04;

import java.util.Scanner;

public class IfElseEx2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.print("점수는 :");
		String input = a.nextLine();

		System.out.println(input);

		int x = Integer.parseInt(input);

		if (100 >= x && x >= 90) {
			System.out.println("A학점 입니다.");
		} else if (90 > x && x >= 80) {
			System.out.println("B학점 입니다.");
		} else if (80 > x && x >= 70) {
			System.out.println("C학점 입니다.");
		} else if (70 > x && x >= 60) {
			System.out.println("D학점 입니다.");
		} else if (60 > x && x >= 0) {
			System.out.println("F학점 입니다.");
		} else
			System.out.println("점수 오류");
		a.close();
	}
}
