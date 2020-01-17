package project;

import java.util.Scanner;

public class Cu extends Main { // 구걸
	private static int level = 1;

	static void cu() { // 구걸
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 자산 : " + money);
			System.out.println("현재 레벨 : " + level);
			System.out.println("-------------------------------------------------");
			System.out.println("구걸능력 -> Lv : " + level +"|"+ level * 10 + "/클릭당");
			System.out.println("-------------------------------------------------");
			System.out.println("1.구걸 업(" + level * 100 + ") | 2.구걸하기 | 3. 뒤로가기");

			int sn = s.nextInt();
			if (sn == 1) {
				cu1();
			} else if (sn == 2) {
				cu2();

			} else if (sn == 3) {
				r = false;
			}
		}
	}

	private static void cu1() {
		if (money >= level * 100) {
			money = money - (level * 100);
			level++;
			System.out.println("레벨 업! 현재 레벨 : " + level);
		} else {
			System.out.println("최소 " + level * 100 + "원 필요.");
		}
	}

	private static void cu2() {
		money += level * 10;

	}

}
