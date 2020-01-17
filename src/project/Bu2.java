package project;

import java.util.Scanner;

public class Bu2 extends Bu {
	static Thread bu2;
	static void bu2() { 
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 땅 값 : " + bal2);
			System.out.println("-------------------------------------------------");
			System.out.println("도시 땅");
			System.out.println("1.구매 2.판매 3.뒤로가기");
			System.out.println("-------------------------------------------------");

			int sn = s.nextInt();
			if (sn == 1) {
				bu21();
			} else if (sn == 2) {
				bu22();
			} else if (sn == 3) {
				r = false;
			}
		}
	}

	private static void bu21() {
		if (money >= 100000) {
			money = money - 100000;
			bal2 = 100000;
			Runnable r = new Runnable() {
				boolean run = true;

				@Override
				public void run() {
					while (run) {
						bal2 = (long) (100000 +(Math.random()-0.5)*100000);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			};
			bu2 = new Thread(r);
			bu2.start();
		} else {
			System.out.println("최소 100000원 필요.");
		}
	}
	
	private static void bu22() {
		money += bal2;
		bal2 = 0;
		bu2.stop();
		
	}

}

