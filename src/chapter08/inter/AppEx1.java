package chapter08.inter;

public class AppEx1 {
	public static void main(String[] args) {
		Pet.staticMethod();
		
		Mal m = new Mal();
		HouseCat h = new HouseCat();
		
		m.sit();
		m.roll();
		m.pull();
		h.sit();
		h.roll();
		h.hunt();
		
		Pet p1 = m;
		Pet p2 = h;
		
		p1.sit();
		p1.roll();
//		p1.pull(); 
		//pull이 SledDog에 있는 거여서 불가 Pet에 없음
		p2.sit();
		p2.roll();
//		p2.hunt();
		//hunt는 고양이한테 있는거라 불가능
		
		SledDog sd = m;
		sd.pull();
//		sd.sit();
//		sd.roll();
		//마찬가지로 sit,roll은
		//Pet에 있는거지 SledDog
		//에 있는것이 아님
		
		System.out.println(sd instanceof Mal);
		System.out.println(sd instanceof SledDog);
		System.out.println(sd instanceof Pet);
		
		Pet p3 = (Pet) sd;
		p3.sit();
		
		if (p2 instanceof SledDog) {
			SledDog sd3 = (SledDog) p2;
		}
	}
}
