package chapter11.p465;

public class Sp { //SmartPhone
	private String c; //company
	private String os;
	
	public Sp(String c, String os) {
		this.c=c;
		this.os=os;
	}
	
	//toStirng 재정의
	@Override
	public String toString() {
		return c+","+os;
	}

}
