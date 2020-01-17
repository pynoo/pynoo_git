package project;

import java.util.Scanner;

public class Main {
	public static volatile long money = 100000;
	static volatile long bal1=0;
	static volatile long bal2=0;
	public static volatile long bal=0;

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean r = true;

		while (r) {
			bal=bal1+bal2;
			System.out.println("-------------------------------------------");
			System.out.println("현재 자산 : " + money +" | 현재 투자금 : "+bal);
			System.out.println("-------------------------------------------");
			System.out.println("1. 구걸 | 2. 알바고용 | 3. 부동산 | 4.종료");
			System.out.println("-------------------------------------------");

			int sn = s.nextInt();
			if (sn == 1) {
				Cu.cu();
			} else if (sn == 2) {
				Al.al();
			} else if (sn == 3) {
				Bu.bu();
			} else if (sn == 4) {
				r = false;
				System.out.println("프로그램이 종료 되었습니다.");
			}
			

		}
	}
}
