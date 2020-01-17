package chapter18;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamEx1 {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("output.txt");
		//위 함수는 byte단위로 읽음
		//is.read();
		//위코드는 int타입이라 4byte
		//함수는 byte타입이라 1byte여서
		//강제 형변환을 해줘야함
		
//		byte b = (byte) is.read();
		int i;
		int cnt=0;
		while ((i=is.read())!= -1) {
			System.out.println(i);
			cnt++;
		}
		System.out.println(cnt + "bytes 크기의 파일");
		is.close();
	}
}
