package chapter12_collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2) * (-1); // 내림차순으로 반환하겠다.
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>(new MyCompare()); // ()안에 new MyCompare처럼 구현하게되면 비교하는방식은
																	// 위의 클래스를 사용하라는 선언이됨.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); // 내림차순으로 정렬이되어 ccc, bbb, aaa가 출력됨
	}

}
