package chapter10.example;

import java.util.Scanner;

public class IN { //InputNumber
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum=0;
		
		for (int i=0 ; i<5 ; i++) {
			System.out.print("입력>");
			String y = s.next();
			try {
			int x = Integer.parseInt(y);
			sum += x;
			
			} catch(NumberFormatException e) {
				System.out.println("숫자만 입력");
				//i--;
			}
			
		}
		System.out.println("총 합은 : " + sum);
		
		s.close();
	}
}
