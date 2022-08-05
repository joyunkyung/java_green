package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample14 {
	
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:/output14.txt");
//		char[] data = "임영웅".toCharArray();
		String data = "안녕 자바 프로그램";
		writer.write(data, 3, 2);
		
//		writer.write(data, 1,2);
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		writer.close();
	}
}
