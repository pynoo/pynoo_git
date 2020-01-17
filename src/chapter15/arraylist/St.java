package chapter15.arraylist;

public class St {
	private String n;
	private int m;
	
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	@Override
	public String toString() {
		return this.n + ", " + this.m;
	}
}
