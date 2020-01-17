package chapter18;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		Reader fr = new FileReader("ooo.txt");
	
		//fr.read();
		//리더는 char타입이고 read()는 int타입
		//char은 2byte이고 int는 4byte
		//그러므로 강제 형변환을 해야함
		//read는 코드값이기에 텍스트로 보고 싶기에
		//형변환한다고 보는 것이 타당
		int i;
		while((i=fr.read()) != -1) {
			char c = (char) i;
			System.out.println(c);
			
		}
		
		System.out.println(fr.read());
		//read는 마지막으로 출력한 문자열의 코드값
		
		

//		c = (char) fr.read();
//		System.out.println(c);
		//한글자씩 읽어서 여러개 쓰면 그만큼 읽음
		//그러므로 반목문을 이용해서 활용
		fr.close();
	}
}
