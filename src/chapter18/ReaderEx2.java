package chapter18;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx2 {
	public static void main(String[] args) {
		try (Reader fr =new FileReader("ooo.txt");){
			char[] ca = new char[10];
			
//			fr.read(ca);
			//위에 있을 경우 이미 한번 읽고 나간 상태
			//위의 코드가 주석이 안되어 있으면
			//처음 10개를 읽고 나간상태여서
			//그 다음부터 출력을 함.
			
//			System.out.println(ca[0]);
//			System.out.println(ca[9]);
			
			while(fr.read(ca) != -1) {
				System.out.println(ca);
			}
			
//			System.out.println(fr.read(ca));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
