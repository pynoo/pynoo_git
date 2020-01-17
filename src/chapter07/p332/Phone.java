package chapter07.p332;

public class Phone {
	//필드
	public String o; //owner
	
	//생성자
	public Phone(String o) {
		this.o=o;
	}
	
	//메소드
	public void to() { //turnOn
		System.out.println("폰 전원을 켭니다.");
	}
	public void tof() { //turnOff
		System.out.println("폰 전원을 끕니다.");
	}
}
