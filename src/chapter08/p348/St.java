package chapter08.p348;

public class St implements Rem,Sa {
	private int v;
	
	@Override
	public void to() {
		System.out.println("SmartTV를 켭니다.");
	}
	
	@Override
	public void tof() {
		System.out.println("SmartTV를 끕니다.");
	}
	
	@Override
	public void sv(int v) {
		if(v>Rem.mav) {
			this.v=Rem.mav;
		} else if(v<Rem.miv) {
			this.v=Rem.miv;
		} else {
			this.v=v;
		}
		System.out.println("현재 TV 볼륨 : " + this.v);
	}

	public void s(String u) {
		System.out.println(u + "을 검색합니다.");
	}
}
