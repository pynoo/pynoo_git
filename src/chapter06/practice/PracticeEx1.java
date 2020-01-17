package chapter06.practice;

public class PracticeEx1 {
	public static void main(String[] args) {
		//객체 생성
		Car x = new Car();
		
		//필드값 읽기
		System.out.println("제작회사 :" + x.company);
		System.out.println("모델명 :" + x.model);
		System.out.println("색깔 :" + x.color);
		System.out.println("최고속도 :" + x.maxSpeed);
		System.out.println("현재속도 :" + x.speed);
		
		x.maxSpeed = 60;
		System.out.println("수정된 속도 :" + x.speed);
		System.out.println("");
		
		//객체 생성
		FieldInitValue y = new FieldInitValue();
		
		System.out.println("byteField :" + y.a);
		System.out.println("shortField :" + y.b);
		System.out.println("intField :" + y.c);
		System.out.println("longField :" + y.d);
		System.out.println("booleanField :" + y.e);
		System.out.println("charField :" + y.f);
		System.out.println("floatField :" + y.g);
		System.out.println("doubleField :" + y.h);
		System.out.println("arrField :" + y.i);
		System.out.println("referenceField :" + y.j);
	}
}
