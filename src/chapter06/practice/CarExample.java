package chapter06.practice;

public class CarExample {
	public static void main(String[] args) {
		Car2 a = new Car2();
		
		a.sg(5); //Car2의 sg()메소드 호출
		
		boolean gs = a.ilg(); 
		if(gs) {
			System.out.println("출발합니다.");
			a.r();
		}
		
		if(a.ilg()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
