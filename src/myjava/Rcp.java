package myjava;

import java.util.Scanner;

public class Rcp {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int uc=0;
		int cc=0;
		
		
		boolean r = true;
		
		while(r) {
			System.out.println("-------------------------------------");
			System.out.println("가위바위보게임");
			System.out.println("유저 : "+uc+"점 | 컴퓨터 : "+cc+"점");
			System.out.println("1.가위 2.바위 3.보");
			System.out.print("선택>");
			int x = s.nextInt();
			int y = (int) (Math.random()*3 + 1);
			System.out.println("-------------------------------------");
			System.out.println("유저선택 : "+x+ "| 컴퓨터선택 : "+y);
		    System.out.println("-------------------------------------");	
			if(x==y) {
				System.out.println("비겼습니다.");
			} else if (x+1==y || x==y+2) {
				System.out.println("컴퓨터 1점추가");
				cc++;
			} else if (x==y+1 || x+2==y) {
				System.out.println("유저 1점추가");
				uc++;
			}
			if(cc==5) {
				System.out.println("컴퓨터 최종승리");
				r= false;
			} else if(uc==5) {
				System.out.println("유저 최종승리");
				r=false;
			}
			
		}
		
				
	}
}
