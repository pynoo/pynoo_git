package chapter06.exercise;

public class Exercise16 {
	public static void main(String[] args) {
		Printer x = new Printer();
		
		x.y(10);
		x.y(true);
		x.y(5.7);
		x.y("홍길동");
		
		System.out.println("--------------------------------------------------");
		
		Printer.z(10);
		Printer.z(true);
		Printer.z(5.7);
		Printer.z("홍길동");
		

	}
}
