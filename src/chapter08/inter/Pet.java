package chapter08.inter;

public interface Pet {
	//field
	int i=3;
	// 접근지정자 public
	// static
	// final
	// 위 3개가 알아서 다 붙어있음
	
	static void staticMethod() {
		System.out.println("스태틱메소드입니다.");
	}
	
	public abstract void sit();
	//인터페이스에서 작성된 메소드는
	//원래 추상메소드여서
	//abstract이 생략
	//기본 접근제한이 public임
	
	void roll();
	default void eat() {
		System.out.println("먹습니다.");
	}
	//추상메소드 쓸 경우에는
	//인터페이스를 준 모든 클래스에
	//써야하는 불편을 있기에
	//default를 주어 몸통을 만들어
	//주고 싶은 곳에만 줄 수 있게 만듬
}
