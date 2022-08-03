package chapter08;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("임영웅",31);
		map.put("영탁",38);
		map.put("이찬원",25);
		map.put("임영웅",30); 
		map.put("김호중",30); 
		map.put("정동원",14); 
			
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("임영웅 : " + map.get("임영웅"));
		System.out.println();
		
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value =  map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		
		map.remove("임영웅");
		System.out.println("총 Entry 수 : " + map.size());
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
	   Iterator<Map.Entry<String, Integer>> enrtyIterator = entrySet.iterator();
		while (enrtyIterator.hasNext()) {
			Map.Entry<String, Integer> entry = enrtyIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
			}
		System.out.println();
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
		
	}
	
	

}
