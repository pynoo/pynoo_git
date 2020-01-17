package chapter08.p348;

public interface Rem { //RemoteControl
	//상수
	public int mav=10; //MAX_VOLUME
	public int miv=0; //MIN_VOLUME
	
	//추상메소드
	public void to(); //turnOn
	public void tof(); //turnOff
	public void sv(int v); //setVolume , volume
	
	//default method
	default void sm(boolean m) { //setMute
		if(m) {
			System.out.println("무음처리합니다.");
		} else {
			System.out.println("무음해제합니다.");
		}
	}
	
	//static method
	static void cb() { //changeBattery
		System.out.println("건전지를 교체합니다.");
	}
}
