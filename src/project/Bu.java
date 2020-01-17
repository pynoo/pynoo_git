package project;

import java.util.Scanner;

public class Bu extends Main {

	
	static void bu() { // 알바
		boolean r = true;
		Scanner s = new Scanner(System.in);

		while (r) {

			bal=bal1+bal2;
			System.out.println("-------------------------------------------------");
			System.out.println("현재 투자금 : " + bal);
			System.out.println("-------------------------------------------------");
			System.out.println("1.시골 땅(현재 땅 값 : "+bal1+")");
			System.out.println("2.도시 땅(현재 땅 값 : "+bal2+")");
			System.out.println("3. 뒤로가기");
			System.out.println("-------------------------------------------------");


			int sn = s.nextInt();
			if (sn == 1) {
				Bu1.bu1();
			} else if (sn == 2) {
				Bu2.bu2();
			} else if (sn == 3) {
				r = false;
			}
		}
	}
	

}

