package chapter09;

public class AppEx1 {
	public static void main(String[] args) {
		Pet p = new Pet() {
			// anonymouse class
			@Override
			public void sit() {
				System.out.println("앉아!!!");
			}
		};
		
		p.sit();
	}
}
