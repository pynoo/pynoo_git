package chapter09.p411;

public class Exam {
	public static void main(String[] args) {
		Am a = new Am();
		//익명 객체 필드 사용
		a.f.to();
		//익명 객체 로컬 변수 사용
		a.m1();
		//익명 객체 매개값 사용
		a.m2(
			new Rc() {
				@Override
				public void to() {
					System.out.println("SmartTV를 켭니다.");
				}
				@Override
				public void tof() {
					System.out.println("SmartTV를 끕니다.");
				}
			}
		);
		
	}
}