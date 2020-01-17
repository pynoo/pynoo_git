package chapter02;

public class CastingAuto {
	public static void main(String[] args) {
		// type casting (auto)
		// 작은 범위의 type은 큼 범위의 type으로
		// 자동 형변화됨.
		
		byte byteVar1 = 100;
		int intVar1;
		intVar1 = byteVar1;
		
		short shortVar1;
		shortVar1= byteVar1;
		
		float floatVar1 = 3.14F;
		double doubleVar1 = floatVar1;
		
		floatVar1 = intVar1;
		
	}
}
