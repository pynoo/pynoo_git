package myjava;

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.print("별의 갯수는? : ");
		int x = a.nextInt();
		
		//x=x+4;
		
		
		for (int i = 0; i < x-1; i++) {
			for (int j = 0; j < 3*(x-1) - i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 0; i < (x+1)/2 ; i++) {
			for (int j = 1; j <= 3 * i; j++) {
				System.out.print(" ");
			}
			for (int j = 1 ; j <= 3*x-2 - 3*i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		for (int i = 0; i < x-2; i++) {
			for (int j = 1 ; j <=x-i+(x-4)/2 ; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= x-2-i; j++) {
				System.out.print("* ");
			}
			for (int j = 0; j < 6*i+((9-x)/2)*2; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= x-2-i; j++) {
				System.out.print("* ");
			}
			
			System.out.println("");
		}
	
		//별을 상단부 중단부 하단부로 3구간으로 나누어 만듬
		//하단부에서 별의 크기가 커질수록 다리부분에 겹치는 부분이 생김
		//이로 인해 갯수가 밀려서 깨지기 시작함 
		
		
		

	}
}
