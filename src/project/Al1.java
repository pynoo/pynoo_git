package project;

import java.util.Scanner;

public class Al1 extends Al {

	static void al1() { // 알바
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 자산 : " + money);
			System.out.println("-------------------------------------------------");
			System.out.println("편의점 알바(현재 Lv : " + level1 + "|" + level1 * 10 + "/3초당");
			System.out.println("1.Level Up (" + level1 + ") 2.뒤로가기");
			System.out.println("-------------------------------------------------");

			int sn = s.nextInt();
			if (sn == 1) {
				al11();
			} else if (sn == 2) {
				r = false;

			} 
		}
	}

	private static void al11() {
		if (money >= (level1 +1)* 1000) {
			money = money - ((level1+1) * 1000);
			level1++;
			Runnable r = new Runnable() {
				boolean run = true;

				@Override
				public void run() {
					while (run) {
						money += level1*1000;
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread al1 = new Thread(r);
			al1.start();
		} else {
			System.out.println("최소 " + (level1+1) * 1000 + "원 필요.");
		}
	}

}
