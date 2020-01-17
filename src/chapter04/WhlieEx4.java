package chapter04;

import java.util.Random;
import java.util.Scanner;

public class WhlieEx4 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random b = new Random();
		
		int x; //randomNumber
		int y; //userNumber
		
		x = b.nextInt(100)+1;
		//System.out.println(x);
		
		while (true) {
			System.out.print("예상? :");
			y=a. nextInt();
			
			if(x == y) {
				System.out.println("정답입니다.");
				break;
			} else if(y>x) {
				System.out.println("Down");
			} else if(y<x) {
				System.out.println("Up");
			}
			
		}
	}
}
