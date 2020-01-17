package chapter07.p322;

public class Exam {
	public static void main(String[] args) {
		Dri d = new Dri();
		
		Bus b = new Bus();
		Taxi t = new Taxi();
		
		d.dr(b);
		d.dr(t);
		
	}
}
