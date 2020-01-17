package chapter06.practice;

public class CarEx1 {
	public static void main(String[] args) {
		Car1 a = new Car1();
		System.out.println("회사 :" + a.company);
		System.out.println("");
		
		Car1 b = new Car1("자가용");
		System.out.println("회사 :" + b.company);
		System.out.println("모델명 :" + b.model);
		System.out.println("");
		
		Car1 c = new Car1("자가용", "빨강");
		System.out.println("회사 :" + c.company);
		System.out.println("모델명 :" + c.model);
		System.out.println("색상 :" + c.color);
		System.out.println("");
		
		Car1 d = new Car1("택시", "검정", 200);
		System.out.println("회사 :" + d.company);
		System.out.println("모델명 :" + d.model);
		System.out.println("색상 :" + d.color);
		System.out.println("최고 속도 :" + d.ms);
		
	}
}
