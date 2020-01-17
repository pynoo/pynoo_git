package chapter08.p348;

public class Au implements Rem {
	//field
	private int v;
	private boolean m;
	
	@Override
	public void to() {
		System.out.println("Audio를 켭니다.");
	}
	
	@Override
	public void tof() {
		System.out.println("Audio를 끕니다.");
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
		System.out.println("현재 Audio 볼륨 : " + this.v);
	}

	@Override
	public void sm(boolean m) {
		this.m=m;
		if(m) {
			System.out.println("Audio 무음처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
