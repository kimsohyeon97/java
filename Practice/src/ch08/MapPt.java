package ch08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class MapPt {

	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<>();
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "cherry");
		System.out.println(map);
		
		System.out.println(map.size());
		System.out.println(map.get('A'));
		System.out.println(map.get('B'));
		System.out.println(map.get('C'));
		
		for(char key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
		
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		Map<Integer, Apple> m1 = new HashMap<Integer, Apple>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 3000));
		m1.put(103, new Apple("일본", 3000));
		
		Map<Integer, Apple> m2 = new HashMap<Integer, Apple>();
		m2.put(101, new Apple("가나", 3000));
		m2.put(102, new Apple("다라", 3000));
		m2.put(103, new Apple("마바", 3000));
		
		Map<Integer, Apple> m3 = new HashMap<Integer, Apple>();
		m3.put(101, new Apple("아자", 3000));
		m3.put(102, new Apple("차카", 3000));
		m3.put(103, new Apple("타파", 3000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		mapList.get(0).get(102).show();
		mapList.get(2).get(102).show();
		
	}
}
