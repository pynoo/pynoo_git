package chapter09.exericse.n05;

public class Am {
	Veh f = new Veh() {
		@Override
		public void r() {
			System.out.println("자전거가 달립니다.");
		}
	};

	void m1() {
		Veh l = new Veh() {
			@Override
			public void r() {
				System.out.println("승용차가 달립니다.");
			}
		};
		l.r();
	}

	void m2(Veh v) {
		v.r();
	}
}
