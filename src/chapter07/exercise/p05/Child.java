package chapter07.exercise.p05;

public class Child extends Parent{
	private int sn; //studentNo
	
	public Child(String n, int sn) {
		super(n);
		this.sn=sn;
		//부모생성자를 가져오기 위해서는 새로 정하는 것이 아닌 
		//super를 이용하여 가져와야함
		//그러지 않으면 컴파일러 에러가 뜸
	}
}
