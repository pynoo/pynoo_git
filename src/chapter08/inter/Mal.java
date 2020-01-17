package chapter08.inter;

public class Mal implements Pet, SledDog { //Malamute
	@Override
	public void sit() {
		System.out.println("말라뮤트가 앉습니다.");

	}
	
	@Override
		public void roll() {
			System.out.println("말라뮤트가 구릅니다.");
		}
	
	@Override
		public void pull() {
			System.out.println("썰매를 끕니다.");
		}
}
