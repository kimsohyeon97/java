package ch08;

import java.util.HashSet;
import java.util.Set;

public class SetPt {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		set.add(5);
		set.add(3);
		
		for(int num : set) {
			System.out.println(num);
		}
		
		//System.out.println(set);
	}
}
