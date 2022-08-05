package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("d:/test.txt");
		int readByte;
		
		while ((readByte = is.read()) != -1) {
			System.out.print((char)readByte);
		}
		
//		while (true) {
//			readByte = is.read();
//			if (readByte == -1) {
//				break;
//			}
//			System.out.print((char)readByte);
//			
//		}
//		
		is.close();
	}

}
