package chapter07.p335;

public class Exam {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		d.s();
		c.s();
		System.out.println("----");
		
		//변수 자동 타입 변환
		Ani a = null;
		// a.s();
		a= new Dog();
		a.s();
		a = new Cat();
		a.s();
		
		System.out.println("----");
		
		//메소드의 다형성
		as(new Dog()); //animalSound
		as(new Cat());
		
	}
	
	public static void as(Ani a) {
		a.s();
	}
}
