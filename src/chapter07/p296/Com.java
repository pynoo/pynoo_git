package chapter07.p296;

public class Com extends Cal {
	@Override
	double ac(double r) {
		System.out.println("com객체의 ac():실행");
		return Math.PI *r*r;
	}
}
