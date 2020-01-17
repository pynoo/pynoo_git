package chapter03;

public class Assignment {
	public static void main(String[] args) {
		// = += -= *= /= %=
		
		int x = 50;
		x += 70;
		System.out.println(x);
		x -= 80;
		System.out.println(x);
		x /=3;
		System.out.println(x);
		x %=5;
		System.out.println(x);
		
		/******************************/
		x +=3; // x= x + 3;
		
		//x = x + 3L;
		//인트 타입하고 float타입 값끼리 계산이라 컴파일러 오류가 나옴
		x += 3L; 
		//x = x+3L;하고 같은 꼴인데 안일어나는 이유는
		// 복할연산자는 알아서 강제로 형변환함
		// x+=3L = x = (int) (x + 3L);
	}
}
