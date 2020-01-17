package chapter04;

public class WhileEx1 {
	public static void main(String[] args) {
		int i =0;
		while (i<3) {
			System.out.println(i);
			i++;
			
		}
		do {
			System.out.println(i);
			i++;
		} while(i<3); //무조건 한번은 실행해야 해서 3이 false이지만 출력이 됨.
		i = 0; //초기상태로
		do {
			System.out.println(i);
			i++;
		} while(i<10);
	}
}
