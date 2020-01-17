package myjava;

import java.util.Random;

public class Lotte {
	public static void main(String[] args) {
		int x[] = new int[6]; //user
		Random a = new Random();
		int y[] = new int[6]; //broadcasting
		Random b = new Random();
		int rescnt=0;
		
		for (int i = 0; i < 6; i++) {
			x[i] = a.nextInt(45) + 1;
			System.out.print(x[i] + "  ");
		}
		System.out.println();
		for (int j = 0; j < 6; j++) {
			y[j] = a.nextInt(45) + 1;
			System.out.print(y[j] + "  ");
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(x[i] == y[j]) {
					rescnt++;
				}
			}
		}
		System.out.println();
		System.out.println("맞은 갯수 :" + rescnt);
		if(rescnt == 6) {
			System.out.println("1등입니다.");
		} else if(rescnt == 5) {
			System.out.println("2등입니다.");
		} else if(rescnt == 4) {
			System.out.println("3등입니다.");
		} else if(rescnt == 3) {
			System.out.println("4등입니다.");
		} else System.out.println("당첨되지 않았습니다.");

	}
}
