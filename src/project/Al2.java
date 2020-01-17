package project;

import java.util.Scanner;

public class Al2 extends Al {

	static void al2() { // 알바
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 자산 : " + money);
			System.out.println("-------------------------------------------------");
			System.out.println("이색 알바(현재 Lv : " + level2 + "|" + level2 * 1000 + "/10초당");
			System.out.println("1.Level Up (" + level2 + ") 2.뒤로가기");
			System.out.println("-------------------------------------------------");

			int sn = s.nextInt();
			if (sn == 1) {
				al12();
			} else if (sn == 2) {
				r = false;

			} 
		}
	}

	private static void al12() {
		if (money >= (level2+1) * 10000) {
			money = money - ((level2+1) * 10000);
			level2++;
			Runnable r = new Runnable() {
				boolean run = true;

				@Override
				public void run() {
					while (run) {
						money += level2*10000;
						try {
							Thread.sleep(10000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			Thread al2 = new Thread(r);
			al2.start();
		} else {
			System.out.println("최소 " + (level2+1) * 10000 + "원 필요.");
		}
	}

}