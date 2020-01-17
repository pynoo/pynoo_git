package chapter07.polymophism.section773;

public class AppEx1 {
	public static void main(String[] args) {
		SmartPhone p = new SmartPhone();
		p.spb(new PowerButton());
		p.svb(new VolumeButton());
		
		p.ppb();
		p.pvb();
		
	}
}
