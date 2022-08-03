package chapter08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class AA{}
public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
//		Set<Object> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");// 중복허용x
		set.add("iBATIS");
//		AA a = new AA();
//		set.add(a);
//		set.add(a.toString());
		
		int size = set.size();
		System.out.println("총 객체수 : " + size);
		
		Iterator<String> iterator = set.iterator();
//		Iterator<Object> iterator = set.iterator();
		while (iterator.hasNext()) {
			String element = iterator.next();
//			Object element = iterator.next();
			System.out.println("\t" + element);		
		}
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체수 : " + set.size());
//		Iterator<String> iterator2 = set.iterator();
//		while (iterator2.hasNext()) {
//			String element = iterator2.next();
//			System.out.println("\t" + element);		
//		}
		for (String string : set) { //for each문
			System.out.println("\t" + string);
		}
		
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}else {
			System.out.println("객체 있음");
		}
		
		set.clear();
		if (set.isEmpty()) {
			System.out.println("비어있음");
		}else {
			System.out.println("객체 있음");
		}
	}
}
