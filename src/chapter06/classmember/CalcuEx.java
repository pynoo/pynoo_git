package chapter06.classmember;

import java.util.Scanner;

public class CalcuEx {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Calcu e = new Calcu();
		
		System.out.print("계산기의 색상을 설정하세요 : ");
		String b = a.nextLine();
		
		
		System.out.println("계산기의 색상은 :" + b);
		
		System.out.println("--------------------------------------");
		
		System.out.print("반지름을 입력하세요 : ");
		int r=a.nextInt();
		double res1 = 2*r*Calcu.pi;
		double res2 = Calcu.pi*r*r;
		
		System.out.println("원의 둘레 :"+ res1);
		System.out.println("원의 넓이 :"+ res2);
		
		System.out.println("--------------------------------------");
		
		System.out.print("숫자 두개를 입력하세요 : ");
		int c= a.nextInt();
		int d = a.nextInt();
		int res3 = Calcu.plus(c,d);
		int res4 = Calcu.minus(c,d);
		
		System.out.println("합 :"+ res3);
		System.out.println("빼기 :"+ res4);

	}
}
