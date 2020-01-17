package chapter04;

import java.util.Scanner;

public class SwitchCaseEx2 {
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);

		System.out.print("등급은 :");
		String x = a.nextLine();
		String y= x.toUpperCase();
		switch (y.substring(0, 1)) { //charAt를 쓸려면 캐릭터 타입이기 때문에
		case "A":								  // "A"가 아닌 'A'를 써야한다
			System.out.println("90점 이상입니다.");
			break;
		case "B":
			System.out.println("80점 이상입니다.");
			break;
		case "C":
			System.out.println("70점 이상입니다.");
			break;
		case "D":
			System.out.println("60점 이상입니다.");
			break;
		case "F":
			System.out.println("60점 미만입니다.");
			break;
		default:
			System.out.println("잘못된 등급");
			break;
		}
		a.close();
	}

}
