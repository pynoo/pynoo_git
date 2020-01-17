package chapter07.constructor;

public class SubClass extends SuperClass {
	
	int k;
//	public SubClass() {
//		//부모 클래스의 생성자를 꼭 호출해야함
//		//쓰나 안쓰나 같긴 함
//		super();
//		
//	}
	public SubClass(int i, int j, int k) {
		super(i,j);
		this.k=k;
	}
	
	
	public SubClass(int i, int j) {
		super(i,j);
	
	}
}
