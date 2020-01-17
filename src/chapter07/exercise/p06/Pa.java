package chapter07.exercise.p06;

public class Pa { //Parent
	//field
	public String n; //nation
	
	
	//생성자
	public Pa() {
		this("대한민국");
		System.out.println("Pa() call");
	}
	
	public Pa(String n) {
		this.n=n;
		System.out.println("Parent(String nation) call");
	}

}
