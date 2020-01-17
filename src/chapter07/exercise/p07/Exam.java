package chapter07.exercise.p07;

public class Exam {
	public static void main(String[] args) {
		SnowTire st = new SnowTire();
		
		Tire t = st;
		
		st.r();
		t.r();
	}
}
