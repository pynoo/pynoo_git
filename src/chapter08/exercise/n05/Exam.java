package chapter08.exercise.n05;

public class Exam {
	public static void main(String[] args) {
		Ac a= new Ac() {
			@Override
			public void work() {
				System.out.println("복사를 합니다.");
			}
		};
		a.work();
	}
}
