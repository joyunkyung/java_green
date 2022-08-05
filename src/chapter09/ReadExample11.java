package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample11 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("d:/test.txt");
		int readData;
		
		while (true) {
			readData =reader.read();
			if (readData == -1) {
				break;
			}
			System.out.print((char)readData);
		}

	}

}
