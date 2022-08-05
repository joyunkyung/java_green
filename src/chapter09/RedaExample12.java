package chapter09;

import java.io.FileReader;
import java.io.Reader;

public class RedaExample12 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("d:/test.txt");
		int readData;
		char[] cbuf = new char[2];
		String data ="";
		
		while (true) {
			readData =reader.read();
			if (readData == -1) {
				break;
			}
			new String(cbuf, 0, readData);
		}
		System.out.print(data);
		
		reader.close();

	}

}
