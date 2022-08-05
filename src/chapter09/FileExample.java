package chapter09;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {
	public static void main(String[] args) throws Exception {
//		File dir = new File("d:/test");
		File dir = new File("d:/test/dir");
		File file1 = new File("d:/test/file1.txt");
		File file2 = new File("d:/test/file2.txt");
		File file3 = new File("d:/test/file3.txt");
		
//		dir.mkdir();
		dir.mkdirs();
		file1.createNewFile();
		file2.createNewFile();
		file3.createNewFile();
		
		File test = new File("d:/test");
		File[] contents = test.listFiles();//파일 목록
		System.out.println("날짜                시간                형태               크기            이름" );
		System.out.println("---------------------------------------------");
		
		SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd a hh:mm");
		for (int i = 0; i < contents.length; i++) {
			System.out.println(sdf.format(new Date( contents[i].lastModified())) );
			if (contents[i].isDirectory()) {
				System.out.println("\t<DIR>\t\t" + contents[i].getName());
			}else {
				System.out.println("\t\t" +contents[i].length() +"\t"+ contents[i].getName() );
			}
		}
	}
}
