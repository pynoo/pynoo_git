package chapter06;

public class AppEx1 {
	public static void main(String[] args) {
		ClassEx1 refVar1 = new ClassEx1();
		//우리가 만든 클래스를 타입으로 써 사용 가능
		ClassEx1 refVar2 = new ClassEx1();
		
		FieldEx1 newInstance1 = new FieldEx1(); //인스턴스가 만들어 진것
		FieldEx1 newInstance2 = new FieldEx1();
		
		System.out.println(newInstance1.intField1);
		System.out.println(newInstance2.intField1);
		
		newInstance1.intField1 = 3;
		newInstance2.intField1 = 33;
		
		System.out.println(newInstance1.intField1);
		System.out.println(newInstance2.intField1);
		
	}
}
