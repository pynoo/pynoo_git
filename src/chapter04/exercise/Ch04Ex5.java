package chapter04.exercise;

import java.util.Scanner;

public class Ch04Ex5 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner a = new Scanner(System.in);
		
		while (run) {
			System.out.println("-------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("-------------------------------");
			System.out.print("선택>");
			int x=a.nextInt();
			
			if(x==1) {
				System.out.print("예금액>");
				int money1 = a.nextInt();
				balance+=money1;
			} else if(x==2) {
				System.out.print("출금액>");
				int money2 = a.nextInt();
				balance-=money2;
			} else if(x==3) {
				System.out.println("잔고>"+balance);
				
			} else if(x==4) {
				break;
			}
			
		}
		
		System.out.println("프로그램 종료");
	}
}
