package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception { //예외처리
		InputStream is = new FileInputStream("d:/test.txt"); //업캐스팅
		int readByteNo;
		byte[] readBytes = new byte[3];
		
		String data ="";
		while ((readByteNo = is.read(readBytes)) != -1) {
			data += new String(readBytes, 0, readByteNo);
		}
		System.out.println(data);
		
//		String data ="";
//		while (true) {
//			readByteNo = is.read(readBytes);
////			System.out.println((char)readByteNo);
//			if(readByteNo == -1) {
//				break;
//			}
//			data += new String(readBytes, 0, readByteNo);
//		}
//		System.out.println(data);
		
		is.close();
	}

}
