package chapter06.practice;

public class Cal {
	
	int plus(int x, int y) {
		int res= x+y;
		return res;
	}
	
	double avg(int x, int y) {
		double sum = plus(x,y);
		double res = sum/2;
		return res;
	}
	
	void exe() {
		double res = avg(7,10);
		println("실행결과 : "+ res);
	}
	
	void println(String m) {
		System.out.println(m);
	}
}
