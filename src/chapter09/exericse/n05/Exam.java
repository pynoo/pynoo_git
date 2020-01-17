package chapter09.exericse.n05;

public class Exam {
	public static void main(String[] args) {
		Am a = new Am();
		a.f.r();
		a.m1();
		a.m2(
			new Veh() {
				@Override
				public void r() {
					System.out.println("트럭이 달립니다.");
				}
			}
		);
	}
}
