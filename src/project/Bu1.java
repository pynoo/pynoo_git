package project;

import java.util.Scanner;

public class Bu1 extends Bu {
	static Thread bu1;
	
	static void bu1() { // 알바
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 땅 값 : " + bal1);
			System.out.println("-------------------------------------------------");
			System.out.println("시골 땅");
			System.out.println("1.구매 2.판매 3.뒤로가기");
			System.out.println("-------------------------------------------------");

			int sn = s.nextInt();
			if (sn == 1) {
				bu11();
			} else if (sn == 2) {
				bu12();
			} else if (sn == 3) {
				r = false;
			}
		}
	}

	private static void bu11() {
		if (money >= 10000) {
			money = money - 10000;
			bal1=10000;
			Runnable r = new Runnable() {
				boolean run = true;

				@Override
				public void run() {
					while (run) {
						bal1 = (long) (10000 +(Math.random()-0.5)*10000);
						
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			bu1 = new Thread(r);
			bu1.start();
		} else {
			System.out.println("최소 10000원 필요.");
		}
	}
	
	private static void bu12() {
		money += bal1;
		bal1 = 0;
		bu1.stop();
		
	}

}


