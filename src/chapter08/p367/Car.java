package chapter08.p367;

public class Car {
	Tire flt = new Hk();
	Tire frt = new Hk();
	Tire blt = new Hk();
	Tire brt = new Hk();
	
	void run() {
		flt.roll();
		frt.roll();
		blt.roll();
		brt.roll();
	}
}
