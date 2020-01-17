package chapter05.exercise;

import java.util.Scanner;

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int x = 0; // studentNum
		int[] y = null; // scores
		Scanner a = new Scanner(System.in);

		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택> ");

			int sum = 0;
			int max = 0;
			double avg = 0;
			int z = a.nextInt();
			int i = 0;

			if (z == 1) {
				System.out.print("학생 수 > ");
				x = a.nextInt();
				y = new int[x];
			} else if (z == 2) {
				for (i = 0; i < x; i++) {
					System.out.print("scores[" + i + "]");
					y[i] = a.nextInt();
				}
			} else if (z == 3) {
				for (i = 0; i < x; i++) {
					System.out.println("scores[" + i + "]" + y[i]);
				}
			} else if (z == 4) {
				for (i = 0; i < x - 1; i++) {
					if (y[i] > y[i + 1]) {
						max = y[i];
					} else
						max = y[i + 1];
				}
				System.out.println("최고점수 :" + max);
				for (int j = 0; j < x; j++) {
					sum += y[j];
				}
				avg = (double) sum / x;
				System.out.println("평균점수 :" + avg);
			} else if (z == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
}
