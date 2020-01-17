package chapter11;

public class MyClass {
	private int i; //id
	private String n; //name
	
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public String getN() {
		return n;
	}
	public void setN(String n) {
		this.n = n;
	}
	
	@Override
	public String toString() {
		String desc = "id : " + this.i + ", name : " +this.n;
		return desc;
	}
	
}
