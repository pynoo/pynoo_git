package chapter08.inter;

public class HouseCat implements Pet {
	@Override
	public void sit() {
		System.out.println("집고양이가 앉습니다.");
	}
	
	@Override
	public void roll() {
		System.out.println("집고양이가 구릅니다.");
	}
	
	void hunt() {
		System.out.println("쥐를 사냥합니다.");
	}
}
