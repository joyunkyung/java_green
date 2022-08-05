package chapter09;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample13 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("d:/output13.txt");
		char[] data = "임영웅".toCharArray();
		
		writer.write(data, 1,2);
		
//		for (int i = 0; i < data.length; i++) {
//			writer.write(data[i]);
//		}
		writer.close();
	}
}
