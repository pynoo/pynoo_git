package chapter06.exercise;

public class Ac {
	private String a; //ano
	private String o; //owner
	private int b; //balance
	
	public Ac(String a, String o, int b) {
		this.a=a;
		this.o=o;
		this.b=b;
		
	}
	public String getAno() { //getAno
		return a;
	}
	public void setAno(String a) { //setAno
		this.a=a;
	}
	public String getOwn() { //getOwner
		return o;
	}
	public void setOwn(String o) { //setOwner
		this.o=o;
	}
	public int getBal() { //getBlance
		return b;
	}
	public void setBal(int b) { //setBlance
		this.b=b;
	}
	
}
