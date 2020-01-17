package chapter07.p299;

public class Su extends Air {
	public static final int Nor=1;
	public static final int Sup=2;
	
	public int fm = Nor; //flyMode
	
	@Override
	public void f() {
		if(fm == Sup) {
			System.out.println("초음속비행합니다");
		} else {
			//Air객체의 f()메소드 호출
			super.f();
		}
	}
	
}
