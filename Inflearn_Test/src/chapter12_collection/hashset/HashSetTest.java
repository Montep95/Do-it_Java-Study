package chapter12_collection.hashset;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		System.out.println(set); // HashSet���� toString �� ������ �Ǿ������Ƿ� �̷��� �ٷ� ��� ����
		
		
		set.add("aaa"); // ��ó�� �߰��� �ص� �ߺ��� ������� �ʱ� ������
		System.out.println(set); // �Ȱ��� ��°��� ������.
		
		// �̸� Ȯ���ϱ� ����
		boolean d1 = set.add("ddd");
		/*
		set.add("aaa");
		set.add("bbb");
		set.add("ccc");
		*/
		System.out.println("ddd �� �߰��Ǿ����ϱ� " + d1);
		// System.out.println(set); // HashSet���� toString �� ������ �Ǿ������Ƿ� �̷��� �ٷ� ��� ����
				
				
		boolean d2 = set.add("ddd"); // ��ó�� �߰��� �ص� �ߺ��� ������� �ʱ� ������
		System.out.println("ddd �� �߰��Ǿ����ϱ� " + d2); // �Ȱ��� ��°��� ������.
				
		// ó�� �߰����ָ�, d1��°��� true = �� ���ԵǾ�����
		// d2��°��� false = �ߺ��� ������� �ʾ� ������ �Ǿ������������� Ȯ���� �����ϴ�.
				
				
		
	}


}
