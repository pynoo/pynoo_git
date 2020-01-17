package chapter07.p296;

public class Exam {
	public static void main(String[] args) {
		int r=10;
		
		Cal x = new Cal();
		System.out.println("원면적 : "+x.ac(r));
		System.out.println();
		
		Com y = new Com();
		System.out.println("원면적 : "+y.ac(r));
	}
}
