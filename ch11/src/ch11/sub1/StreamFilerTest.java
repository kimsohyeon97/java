package ch11.sub1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamFilerTest {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(nums);
		
		//중복제거
		nums.stream().distinct().forEach(num ->System.out.print(num+", "));
		System.out.println();
		
		//5이상 데이터 필터링
		nums.stream()
			.filter((num)->{
				
				if(num>=5) {
					return false;
				}else {
					return true;
				}
				
			}).forEach((num)->{
				System.out.print(num+", ");
			});
		
		//중복제거, 짝수 데이터 필터링, 내림차순 정렬
		nums
			.stream()
			.distinct()
			.filter(num -> num%2 ==0)
			.sorted(Collections.reverseOrder())
			.forEach(num -> System.out.print(num+", "));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
