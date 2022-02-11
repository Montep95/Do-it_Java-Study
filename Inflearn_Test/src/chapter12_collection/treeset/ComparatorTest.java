package chapter12_collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String str1, String str2) {
		
		return str1.compareTo(str2) * (-1); // ������������ ��ȯ�ϰڴ�.
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>(new MyCompare()); // ()�ȿ� new MyCompareó�� �����ϰԵǸ� ���ϴ¹����
																	// ���� Ŭ������ ����϶�� �����̵�.
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); // ������������ �����̵Ǿ� ccc, bbb, aaa�� ��µ�
	}

}
