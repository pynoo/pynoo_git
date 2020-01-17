package chapter06.classmember;

public class Calcu {
	String color;
	
	void sc(String color) {
		this.color = color;
		
	}
	
	static double pi = 3.14;
	static int plus(int x, int y) {
		return x+y;
	}
	static int minus(int x, int y) {
		return x-y;
	}
	
}
