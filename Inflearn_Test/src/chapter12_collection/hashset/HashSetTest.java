package chapter12_collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set); // HashSet에는 toString 이 구현이 되어있으므로 이렇게 바로 출력 가능
		
		
		set.add("aaa"); // 이처럼 추가를 해도 중복을 허용하지 않기 때문에
		System.out.println(set); // 똑같은 출력값을 가진다.
		
		// 이를 확인하기 위해
		boolean d1 = set.add("ddd");
		/*
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		*/
		System.out.println("ddd 가 추가되었습니까 " + d1);
		// System.out.println(set); // HashSet에는 toString 이 구현이 되어있으므로 이렇게 바로 출력 가능
				
				
		boolean d2 = set.add("ddd"); // 이처럼 추가를 해도 중복을 허용하지 않기 때문에
		System.out.println("ddd 가 추가되었습니까 " + d2); // 똑같은 출력값을 가진다.
				
		// 처럼 추가해주면, d1출력값은 true = 잘 삽입되어있음
		// d2출력값은 false = 중복을 허용하지 않아 삽입이 되어있지않음으로 확인이 가능하다.
				
				
		
	}


}
