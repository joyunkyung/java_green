package chapter08;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet");
		list.add(2, "Database");
		
		int size = list.size();
		System.out.println("총 list개수: " + size);
		
		String skill = list.get(2);
		System.out.println("2번째 인덱스: " + skill);
		
		System.out.println();
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		list.remove(2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();
		list.remove("Spring");
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		
	}
}
