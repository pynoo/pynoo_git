package chapter04;

import java.util.Random;

public class WhileEx2 {
	public static void main(String[] args) {
		Random a= new Random();
		
		int dice1;
		int dice2;
		int x=0;
		
		do {
			dice1 = a.nextInt(6)+1;
			dice2 = a.nextInt(6)+1;
			System.out.print(dice1 + "," + dice2 + "  ");	
			x++;
		} while(dice1 != dice2);
		System.out.println();
		System.out.println(x + "번");
	}
}
