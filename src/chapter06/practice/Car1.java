package chapter06.practice;

public class Car1 {
	// 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	int ms;

	// 생성자
	Car1() {

	}

	Car1(String model) {
		this.model = model;
	}

	Car1(String model, String color) {
		this.model = model;
		this.color = color;
	}

	Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		ms = maxSpeed;
	}
}
