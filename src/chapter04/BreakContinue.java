package chapter04;

public class BreakContinue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if(i==3) {
				continue;
			}
			System.out.println(i);
			if(i==7) {
				break;
			}
		}
	}
}
