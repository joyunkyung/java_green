package chapter08;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 ArrayList<String> array = new ArrayList<String>();
		 
		 for (int i = 0; i < 4; i++) {
			 System.out.println("이름을 입력하세요>> ");
			 String str =scanner.nextLine();
			 array.add(str);
		}
		 
		 for (int i = 0; i <  array.size(); i++) {
			String name = array.get(i);
			System.out.println(name);
		}
		 
		 int longname = 0;
		 for (int i = 1; i < array.size(); i++) {
			if (array.get(longname).length() < array.get(i).length()) {
				longname = i;
			}
			
			
			
		}
		
		 System.out.println("가장 긴 이름: "+array.get(longname));
	}

}
