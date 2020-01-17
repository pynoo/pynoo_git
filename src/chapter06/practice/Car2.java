package chapter06.practice;

public class Car2 {
	// 필드
	int g; // gas

	// 생성자

	// 메소드
	void sg(int g) { // setgas
		this.g = g;
	}

	boolean ilg() { // isleftgas
		if (g == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void r() { // run
		while (true) {
			if (g > 0) {
				System.out.println("달립니다.(gas 잔량 : " + g + ")");
				g -= 1;
			} else {
				System.out.println("멈춥니다.(gas 잔량 : " + g + ")");
				return; // 메소드 종료
			}
		}
	}
}
