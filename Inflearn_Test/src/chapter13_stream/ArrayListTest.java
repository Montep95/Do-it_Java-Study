package chapter13_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("James");
		sList.add("Edward");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s -> System.out.println(s)); // forEach = �ϳ��� ���� ������
		// ���⼭ forEach�� Tomas, James, Edward ���� �ϳ��� ������ ������ �϶�� �ǹ�.
		// �̴� �� �ڵ�ó�� ǥ���� ���� �ִ�.
		/*
		for (String s : sList)
		{
			System.out.println(s);
		}
		*/
		
		sList.stream().sorted().forEach(s->System.out.println(s)); // �������� �����Ͽ� ���
		// Edward -> James -> Tomas
	}

}
