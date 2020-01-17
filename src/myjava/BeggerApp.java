package myjava;

import java.util.Scanner;

public class BeggerApp {
	private static Scanner scanner = new Scanner(System.in);
	private static int level = 1;
	private static volatile long money = 0;
	private static volatile boolean mainLoop = true;

	public static void main(String[] args) {
//		boolean subLoop = true;

		while (mainLoop) {
			System.out.println("---------------------------");
			System.out.println("1.구걸 2.알바 3.회사 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int sel = scanner.nextInt();

			switch (sel) {
			case 1:
				runbeg();
				break;
			case 2:
				runAlba();
				break;
			case 3:
				runCompany();
				break;
			default:
				System.out.println("프로그램을 종료합니다.");

				scanner.close();
				mainLoop = false;
				break;
			}
		}
		
		return ;
	}

	private static void runCompany() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				while (mainLoop) {
					money += Math.floor(Math.random() * 100) * 100 + 10000;
					System.out.println("회사 매출! 현재금액: " + money);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread company = new Thread(r);
		company.start();

	}

	private static void runAlba() {
		Runnable r = new Runnable() {

			@Override
			public void run() {
				while (mainLoop) {
					money += 100;
					System.out.println("알바비입금! 현재금액: " + money);
					try {
						Thread.sleep(3000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Thread alba = new Thread(r);
		alba.start();
	}

	private static void runbeg() {
		boolean subLoop = true;

		while (subLoop) {
			System.out.println("---------------------------");
			System.out.println("1.구걸업 2.구걸 3.뒤로가기");
			System.out.println("---------------------------");
			System.out.print("선택>");
			int sel = scanner.nextInt();

			switch (sel) {
			case 1:
				levelup();
				break;
			case 2:
				beg();
				break;
			case 3:
			default:
				subLoop = false;
				break;
			}
		}
	}

	private static void beg() {
		money += level * 10;
		System.out.println("구걸 하기! 현재금액 : " + money);

	}

	private static void levelup() {
		if (money >= level * 1000) {
			level++;
			System.out.println("레벨 업! 현재 레벨 : " + level);
		} else {
			System.out.println("최소 " + level * 1000 + "원 필요.");
		}
	}
}
