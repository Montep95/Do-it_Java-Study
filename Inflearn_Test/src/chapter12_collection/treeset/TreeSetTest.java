package chapter12_collection.treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<String>();
		
		tree.add("aaa");
		tree.add("ccc");
		tree.add("bbb");
		
		System.out.println(tree); // Collection �����ӿ�ũ�� Ŭ�������� ��� toString�� ������ �Ǿ������Ƿ� �׳� tree�� ����ص��˴ϴ�.
									// TreeSet ���� ������ �����Ǿ��ֱ⶧���� (Comparable �������̽� ����)
									// aaa, bbb, ccc ó�� ������ �Ǿ� ����̵Ǵ� ���� Ȯ�� �����մϴ�.
	}

}
