package chapter06.exercise;

public class Account {
	private static final int MIN_BALANCE = 0;
	private static final int MAX_BALANCE = 1000000;

	int m = 0;

	public void sb(int i) {
		if (i > MIN_BALANCE && i < MAX_BALANCE) {
			m=i;
		} 
			
	}
	

	public int gb() {
		return m;
	}
		

}
