package chapter07.exercise.p06;

public class Ch extends Pa { //Child
	private String na; 
	
	public Ch() {
		this("hong");
		System.out.println("Child() call");
	}

	public Ch(String n) {
		this.na=n;
		System.out.println("Child(String name) call");
		System.out.println(na);
	}
}
