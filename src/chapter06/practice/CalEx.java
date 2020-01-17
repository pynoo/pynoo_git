package chapter06.practice;

public class CalEx {
	public static void main(String[] args) {
		Calulator a = new Calulator();
		a.poweron();
		
		int result1 = a.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		byte x=10;
		byte y=4;
		double result2 = a.divide(x, y);
		System.out.println("result2 : "+ result2);
		
		a.poweroff();
		
		System.out.println("-----------------------------");
		
		Cal b = new Cal();
		b.exe();
	}
}
