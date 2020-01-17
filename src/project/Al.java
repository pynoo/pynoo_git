package project;

import java.util.Scanner;

public class Al extends Main {
	public static int level1 = 0;
	public static int level2 = 0;

	static void al() { // 알바
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			System.out.println("-------------------------------------------------");
			System.out.println("현재 자산 : " + money);
			System.out.println("-------------------------------------------------");
			System.out.println("1.편의점 알바(현재 Lv : " + level1 + "|" + level1 * 10 + "/3초당");
			System.out.println("2.이색 알바(현재 Lv : " + level2 + "|" + level2 * 10 + "/10초당");
			System.out.println("3. 뒤로가기");
			System.out.println("-------------------------------------------------");


			int sn = s.nextInt();
			if (sn == 1) {
				Al1.al1();
			} else if (sn == 2) {
				Al2.al2();

			} else if (sn == 3) {
				r = false;
			}
		}
	}
	

}
