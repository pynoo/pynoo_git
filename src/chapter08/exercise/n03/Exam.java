package chapter08.exercise.n03;

public class Exam {
	private static void ps(Sa sa) {
		System.out.println(sa.s());
	}
	
	public static void main(String[] args) {
		ps(new Cat());
		ps(new Dog());
	}
}
