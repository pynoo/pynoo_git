package chapter06.exercise;

public class Exercise19 {
	public static void main(String[] args) {
		Account a = new Account();
		
		a.sb(10000);
		System.out.println("현재 잔고 :"+ a.gb());
		
		a.sb(-100);
		System.out.println("현재 잔고 :"+ a.gb());
		
		a.sb(2000000);
		System.out.println("현재 잔고 :"+ a.gb());
		
		a.sb(300000);
		System.out.println("현재 잔고 :"+ a.gb());
	}
}
