package chapter06.exercise;

import java.util.Scanner;

public class Exercise20 {
	private static Ac[] x = new Ac[100];
	private static Scanner y = new Scanner(System.in);
	private static int size=0;

	public static void main(String[] args) {
		
		boolean r = true; // run
		while (r) {
			System.out.println("-------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5.종료 ");
			System.out.println("-------------------------------------------------------");
			System.out.print("선택 > ");

			int sn = y.nextInt(); // selectNo

			if (sn == 1) {
				ca(); // createAccount
			} else if (sn == 2) {
				al(); // accountList
			} else if (sn == 3) {
				d(); // deposit
			} else if (sn == 4) {
				w(); // withdraw
			} else if (sn == 5) {
				r = false;
			}
		}
		System.out.println("프로그램 종료");
	}


	
	// 계좌생성하기
	private static void ca() {
		System.out.println("-----------");
		System.out.println("계좌생성");
		System.out.println("-----------");
		System.out.print("계좌번호 : ");
		String a = y.next();
		System.out.print("계좌주 : ");
		String o = y.next();
		System.out.print("초기 입금액 : ");
		int b=y.nextInt();
		
		
		Ac ac = new Ac(a, o, b);
		x[size] = ac;
		size++;
		
		System.out.println("계좌가 생성되었습니다.");
		
		
	}

	//계좌목록보기
	private static void al() {
		System.out.println("-----------");
		System.out.println("계좌목록");
		System.out.println("-----------");
		System.out.println();
		
		for(int i=0;i<size;i++) {
			String info = x[i].getAno();
			info += "\t" + x[i].getOwn();
			info += "\t" + x[i].getBal();
			
			System.out.println(info);
		}
	}
	
	//예금하기
	private static void d() {
		System.out.println("--------");
		System.out.println("예금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String a = y.next();
		
		Ac ac = fa(a);
		
		System.out.print("예금액: ");
		int money = y.nextInt();
		money += ac.getBal();
		ac.setBal(money);
		System.out.println("결과: 예금이 성공되었습니다.");
		
	}
	
	//출금하기
	private static void w() {
		System.out.println("--------");
		System.out.println("출금");
		System.out.println("--------");
		System.out.print("계좌번호: ");
		String a = y.next();
		
		Ac ac = fa(a);
		
		System.out.print("출금액: ");
		int money = y.nextInt();
		money = ac.getBal() - money;
		ac.setBal(money);
		System.out.println("결과: 출금이 성공되었습니다.");
	}
	
	//Ac(Account)배열에서 a(ano)와 동일한 Ac(Account) 객체 찾기
	private static Ac fa(String a) { //findAccount
		for (int i = 0; i < size; i++) {
			if (x[i].getAno().equals(a)) {
				return x[i];
			}
		}
		
		return null;
	}
	
}
	
	
