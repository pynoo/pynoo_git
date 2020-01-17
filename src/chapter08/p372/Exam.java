package chapter08.p372;

public class Exam {
	public static void main(String[] args) {
		Dri dr = new Dri();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		dr.d(b);
		dr.d(t);
	}
}
