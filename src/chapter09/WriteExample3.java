package chapter09;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample3 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("d:/output.txt");
		byte[] data = "DEF".getBytes();
		
		os.write(data,1,2);
		
//		for (int i = 0; i < data.length; i++) {
//			os.write(data[i]);
//		}
//		os.flush();
		os.close();
}

}
