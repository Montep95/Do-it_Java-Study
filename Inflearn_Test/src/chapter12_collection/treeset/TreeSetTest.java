package chapter12_collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); // Collection 프레임워크의 클래스들은 모두 toString이 구현이 되어있으므로 그냥 tree로 출력해도됩니다.
									// TreeSet 에는 정렬이 구현되어있기때문에 (Comparable 인터페이스 구현)
									// aaa, bbb, ccc 처럼 정렬이 되어 출력이되는 것을 확인 가능합니다.
	}

}
