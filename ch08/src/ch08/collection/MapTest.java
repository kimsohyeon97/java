package ch08.collection;

import java.util.*;


public class MapTest {
	public static void main(String[] args) {
		
		Map<Character, String> map = new HashMap<>();
		
		map.put('A',"Apple");
		map.put('B',"Banana");
		map.put('C',"Cherry");
		
		System.out.println(map);
		
		System.out.println("map 크기 : "+map.size());
		
		System.out.println("map key-A : "+map.get('A'));
		System.out.println("map key-B : "+map.get('B'));
		System.out.println("map key-C : "+map.get('C'));
		
		for(char key : map.keySet())
			System.out.println(key + "-"+map.get(key));
		
		//List와 Map을 이용한 자료구조
		List<Map<Integer, Apple>> mapList = new ArrayList<>();
		
		
		Apple a1 = new Apple("한국",3000);
		
		Map<Integer,Apple> m1 = new HashMap<> ();
		m1.put(101,a1);
		m1.put(102,new Apple("미국",3000));
		m1.put(103,new Apple("일본",3000));
		
		Map<Integer,Apple> m2 = new HashMap<> ();
		m2.put(201,new Apple("중국",3000));
		m2.put(202,new Apple("호주",3000));
		m2.put(203,new Apple("영국",3000));
		
		Map<Integer,Apple> m3 = new HashMap<> ();
		m3.put(301,new Apple("대만",3000));
		m3.put(302,new Apple("태국",3000));
		m3.put(303,new Apple("인도",3000));
		
		mapList.add(m1);
		mapList.add(m2);
		mapList.add(m3);
		
		Map<Integer,Apple> list1 = mapList.get(0);
		Apple apple1 = list1.get(101);
		System.out.println(apple1);
		
		mapList.get(0).get(102).show();
		System.out.println();
		
		mapList.get(1).get(202).show();
		System.out.println();
		
		mapList.get(2).get(301).show();
		System.out.println();
		
		mapList.get(2).get(303).show();
		System.out.println();
		
	}
}
