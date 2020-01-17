package chapter09.p411;

public class Am {
	//필드 초기값으로 대입
	Rc f = new Rc() {
		@Override
		public void to() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void tof() {
			System.out.println("TV를 끕니다.");
		}
	};
	
	void m1() {
		//로컬변수값을 대입
		Rc l = new Rc() {
			@Override
			public void to() {
				System.out.println("Audio를 켭니다.");
			}
			@Override
			public void tof() {
				System.out.println("Audio를 끕니다.");
			}
		};
	l.to();
	}
	void m2(Rc rc) {
		rc.to();
	}
}
