package chapter07.p299;

public class Exam {
	public static void main(String[] args) {
		Su x = new Su();
		
		x.t();
		x.f();
		x.fm = Su.Sup;
		x.f();
		x.fm = Su.Nor;
		x.f();
		x.l();
	}
}
